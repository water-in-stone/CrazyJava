public class TestThread2
{
	public static void main(String[] args) 
	{
		Runner RunningMan = new Runner();
		RunningMan.start();//使用RunningMan的start()才能启动线程，start()方法会通知CPU
		for (int i=0;i<100 ;i++ )
		{
			System.out.println("Main的状态"+i);
		}
		
	}
}
//不推荐使用继承Thread类的方法，因为Java里只能单继承，使用插入Runnable接口的话能插其他接口，且能继承
class Runner extends Thread
{
	public void run() //重写了Runnable中的run方法
	{
		for (int i = 0;i<100 ;i++ )
		{
			System.out.println("Runner的状态"+i);
		}
	}

}
