public class TestThread2
{
	public static void main(String[] args) 
	{
		Runner RunningMan = new Runner();
		RunningMan.start();//ʹ��RunningMan��start()���������̣߳�start()������֪ͨCPU
		for (int i=0;i<100 ;i++ )
		{
			System.out.println("Main��״̬"+i);
		}
		
	}
}
//���Ƽ�ʹ�ü̳�Thread��ķ�������ΪJava��ֻ�ܵ��̳У�ʹ�ò���Runnable�ӿڵĻ��ܲ������ӿڣ����ܼ̳�
class Runner extends Thread
{
	public void run() //��д��Runnable�е�run����
	{
		for (int i = 0;i<100 ;i++ )
		{
			System.out.println("Runner��״̬"+i);
		}
	}

}
