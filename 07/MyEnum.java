public class MyEnum
{
	public enum MyColor {red,blue,green}
	
	public static void main(String[] args) 
	{
		
		//MyColor mc = new MyColor(red);������÷�����ʵMyColor����ֻ��red��blue��green��������̬������ֱ�ӷ��ʲ���new
		MyColor mc = MyColor.red;
		switch (mc)
		{
		case red:
			System.out.println("red");
			break;
		case blue:
			System.out.println("blue");
			break;
		case green:
			System.out.println("green");
			break;
		default :
			System.out.println("error");
		}
		System.out.println(mc);
	}
}
