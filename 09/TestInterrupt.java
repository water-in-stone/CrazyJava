import java.util.*;
public class TestInterrupt
{
	public static void main(String[] args) 
	{
		Mythread thread = new Mythread();
		thread.start();
		try
		{
			Thread.sleep(4000);//���߳�˯����
		}
		catch (InterruptedException e)
		{
		}
		//��õĹر��̵߳ķ�������
		thread.shutDown();
		//thread.interrupt();//�˷�����ʵ���ã��Դֱ�
		//���������interrupt������ʹ�����߳�thread������InInterruptedException���Ӷ����߳�ֹͣ
		
	}
}
class Mythread extends Thread
{
	private boolean flag = true;
	public void run()  //���ﲻ��throw�쳣����Ϊ�����������д��run����������д�����׳���ԭ���ķ�����ͬ���쳣
	{
		while (flag == true)
		{
			System.out.println(new Date());
			try
			{
				sleep(1000);
			}
			catch (InterruptedException i)
			{

				//return;//�����Ƽ�����д���������returnֱ�ӽ����̣߳����Ƽ���stop()��������Ϊstop()̫�ֱ��ˣ�ֱ�ӹر��߳�
			}
		}
	}
	public void shutDown()
	{
		flag = false;
	}
}