public class TestThread
{
	public static void main(String[] args) 
	{
		Runner RunningMan = new Runner();
		/* 这里出现了多态，Thread()原本传的是Runable接口，这里实际
		传的是Runnable的子类Runner
		*/
		Thread T1 = new Thread(RunningMan);
		T1.start();//使用Thread的start()才能启动线程，start()方法会通知CPU
		System.out.println(T1.getPriority());
		for (int i=0;i<100 ;i++ )
		{
			System.out.println("Main的状态"+i);
		}
	}
}
class Runner implements Runnable
{
	public void run() //重写了Runnable中的run方法
	{
		for (int i = 0;i<100 ;i++ )
		{
			System.out.println("Runner的状态"+i);
		}
	}

}
