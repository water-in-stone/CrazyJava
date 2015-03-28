public class TestPriority 
{
	public static void main(String[] args) 
	{
		Thread one = new Thread(new MyThread1());
		Thread two = new Thread(new MyThread2());			
		/*one.setPriority(NORM_PRIORITY+3);
		����Thread�ľ�̬����NORM_PRIORITYӦ�õķ�������
		*/
		one.setPriority(Thread.NORM_PRIORITY + 3);
		one.start();
		two.start();
	}
}
class MyThread1 implements Runnable
{
	public void run()
	{
		for (int i =0;i<=100 ;i++ )
		{
			System.out.println("I am one: "+i);
		}
		
	}
}
class MyThread2 implements Runnable
{
	public void run()
	{
		for (int i =0;i<=100 ;i++ )
		{
			System.out.println("I am two: "+i);
		}
		
	}
}