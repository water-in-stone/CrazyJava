public class  TestString
{
	public static void main(String[] args) 
	{
		String s1 = new String ("hello,Android&Java");
		System.out.println(s1.charAt(10));
		double d1 = 523464427.645788;
		String s2 = String.valueOf(d1);  //String 类本身就已经提前定义好了，直接用String.valueOf()就好
		System.out.println("d1的位数是" + s2.length());    //  应是s2.length()
		String s3 = "Talk is chief,show me your code";
		String[] s4 = s3.split(",");
		for (int i = 0;i < s4.length; i++ )   //数组的计算长度的方法是s4.length
		{
			System.out.println(s4[i]);
		}
		
	}
}
