public class TestJoin
{
	public static void main(String[] args) 
	{
		MyThread thread =new MyThread("Young");
		thread.start();
		try
		{
			thread.join();//�����̺߳ϲ�
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
class MyThread extends Thread //��û�����Runnable�ӿ�
{
	MyThread(String s)
	{
		super(s);//����Thread�Ĺ��췽��
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