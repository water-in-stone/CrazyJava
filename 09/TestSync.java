public class TestSync implements Runnable
{
	//���MyTimer�����д�����棬��Ϊ���ܱ���д��run������ʹ�ã�����main������д�����÷�Χֻ��main����
	MyTimer timer = new MyTimer();
	public static void main(String[] args) 
	{
		
		TestSync test = new TestSync();//��������
		Thread wang = new Thread(test);
		Thread young = new Thread(test);
		wang.setName("Wang");
		young.setName("Young");
		wang.start();
		young.start();
		
	}
	//TestSync�������Runnable�ӿڣ���Ҫ��дrun������ע��Ӧ��main��������дrun����
	public void run()
	{
		timer.add(Thread.currentThread().getName());
	}		
}
class MyTimer 
{
	private static int num = 0;
	public synchronized void add(String name)
	{
		//��û�н���ͬ����������������»���ִ�������Ӧ������������add������voidǰ���synchronized�ؼ���
		//������synchronized(this)����ס�������
		num++;
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
		}
		System.out.println(name + "���ǵ�" + num + "��ʹ��timer���߳�");
	}
}
