//��Java API�������StringBuffer��ʹ��
public class TestStringBuffer
{
	public static void main(String[] args) 
	{
		StringBuffer s1 = new StringBuffer("Hello,Android");  //��newһ��StringBuffer����
		s1.append("I want to write an apps").insert(13,"/*call me Young*/");;
		System.out.println(s1);
	}
}
