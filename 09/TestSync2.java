public class TestSync2 implements Runnable
{

	int b = 100;
	//��֤�������������2���ڲ��ܱ������̷߳���

	public synchronized void method1() throws Exception
	{	
		System.out.println("��ʱb =" + b);
		b = 1000;
		//Thread.sleep(2000);
			
		System.out.println("method1��b = " + b);
		
	}
	//method2�м���synchronized�ؼ��ֺ�������һʱ��ֻ����һ���̷߳�������������൱��һ����
	//������������ͬһ������з���ʱ���ǵ�Ҫ���ϣ��������鷳
	public synchronized void method2() throws Exception
	{
		System.out.println("��ʱ b =" + b);
		Thread.sleep(3000);
		b = 2000;	
		System.out.println("method2: b =" + b);//�˷����ڲ���synchronized֮ǰ�ܶ�b�����޸ģ���Ϊ��������m1��������b��ȫ�ֱ���
	}
	public void run() 
	{
		try
		{
			method1();	
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
				
	}
	public static void main(String[] args) throws Exception
	{
		TestSync2 t1 = new TestSync2();
		Thread test = new Thread(t1);
		test.start();
		//method2����synchronized�󣬴˴�������method2���������������������run�����е�method1
		t1.method2();
		System.out.println("��ʱt1��b��ֵ�� " + t1.b);
	}
}