public class TestJoin
{
	public static void main(String[] args) 
	{
		MyThread thread =new MyThread("Young");
		thread.start();
		try
		{
			thread.join();//与主线程合并
		}
		catch (InterruptedException e)
		{
		}
		for (int i = 0;i < 10 ;i++ )
		{
			System.out.println("I am main");
		}
		
	}
}
class MyThread extends Thread //最好还是用Runnable接口
{
	MyThread(String s)
	{
		super(s);//调用Thread的构造方法
	}
	public void run()
	{
		for (int i =0;i<10 ;i++ )
		{
			System.out.println("I am "+getName());
			try
			{
				sleep(1000);
			}
			catch (InterruptedException e)
			{
				return;
			}
		}
		
	}
}
