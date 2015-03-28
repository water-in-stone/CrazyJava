class DataWrap
{
	int a;
	int b;
}
public class TestMethod2 
{
	public static void main(String[] args) 
	{
		DataWrap dw=new DataWrap();
		dw.a=6;
		dw.b=9;
		swap(dw);         //这里的dw是一个引用（相当于指针），则传入后swap对其进行的修改就是实际的修改
		System.out.println("a="+dw.a+"b="+dw.b);  

	}
public static void swap(DataWrap dw)
	{	
		int temp = dw.a;
		dw.a = dw.b;
		dw.b = temp;
		System.out.println("a="+dw.a+"b="+dw.b);
	}
}
