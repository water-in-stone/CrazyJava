public class TestSync2 implements Runnable
{

	int b ��
	//��֤�������������2���ڲ��ܱ������̷߳���
	public synchronized void method1 ()throws Exception 
	{	
		b = 300;
		Thread.sleep(2000);
		System.out.println(b);
		
	}
	public void method2()
	{
		b = 200;
		System.out.println(b);//�˷����ڲ���synchronized֮ǰ�ܶ�b�����޸ģ���Ϊ��������m1��������b��ȫ�ֱ���
	}
	public void run()
	{
		method1.();
	}
	public static void main(String[] args) throws Exception 
	{
		TT t1 = new TT();
		t1.m1();
		t1.m2();
	}
}
