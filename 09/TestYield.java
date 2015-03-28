public class TestYield
{
	public static void main(String[] args) 
	{
		MyThread a = new MyThread("Python");
		MyThread b = new MyThread("Java");
		a.start();
		b.start();//这里加上主线程共有3个线程
	}
}
class MyThread extends Thread
{
	MyThread(String s)
	{
		super(s);//条用Thread的构造方法
	}
	public void run()
	{
		for (int i =0;i<=100 ;i++ )
		{
			System.out.println("I am "+getName()+" : "+i);
			if (i %10 == 0)
			{
				yield();//每当i=10时，线程暂停让出空间给另外一个线程
			}
		}
		
	}
}

