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
		swap(dw);         //�����dw��һ�����ã��൱��ָ�룩�������swap������е��޸ľ���ʵ�ʵ��޸�
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
