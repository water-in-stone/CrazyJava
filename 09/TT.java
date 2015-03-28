public class TestSync2 implements Runnable
{

	int b ；
	//保证的是这个方法在2秒内不能被其他线程访问
	public synchronized void method1 ()throws Exception 
	{	
		b = 300;
		Thread.sleep(2000);
		System.out.println(b);
		
	}
	public void method2()
	{
		b = 200;
		System.out.println(b);//此方法在不加synchronized之前能对b进行修改，因为锁定的是m1方法，而b是全局变量
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
