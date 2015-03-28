public class MyEnum
{
	public enum MyColor {red,blue,green}
	
	public static void main(String[] args) 
	{
		
		//MyColor mc = new MyColor(red);错误的用法，其实MyColor里面只有red，blue，green这三个静态变量，直接访问不用new
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
