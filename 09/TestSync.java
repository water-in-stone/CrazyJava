public class TestSync implements Runnable
{
	//这个MyTimer类必须写在外面，因为才能被重写的run方法所使用，若在main方法里写则作用范围只在main方法
	MyTimer timer = new MyTimer();
	public static void main(String[] args) 
	{
		
		TestSync test = new TestSync();//调用自身
		Thread wang = new Thread(test);
		Thread young = new Thread(test);
		wang.setName("Wang");
		young.setName("Young");
		wang.start();
		young.start();
		
	}
	//TestSync类插入了Runnable接口，则要重写run方法，注意应在main方法外重写run方法
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
		//在没有进行同步（锁定）的情况下会出现错误，所以应该锁定，即在add方法中void前添加synchronized关键字
		//或者用synchronized(this)来锁住这个对象
		num++;
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
		}
		System.out.println(name + "你是第" + num + "个使用timer的线程");
	}
}
