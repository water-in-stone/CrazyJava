public class TestThread
{
	public static void main(String[] args) 
	{
		Runner RunningMan = new Runner();
		/* ��������˶�̬��Thread()ԭ��������Runable�ӿڣ�����ʵ��
		������Runnable������Runner
		*/
		Thread T1 = new Thread(RunningMan);
		T1.start();//ʹ��Thread��start()���������̣߳�start()������֪ͨCPU
		System.out.println(T1.getPriority());
		for (int i=0;i<100 ;i++ )
		{
			System.out.println("Main��״̬"+i);
		}
	}
}
class Runner implements Runnable
{
	public void run() //��д��Runnable�е�run����
	{
		for (int i = 0;i<100 ;i++ )
		{
			System.out.println("Runner��״̬"+i);
		}
	}

}