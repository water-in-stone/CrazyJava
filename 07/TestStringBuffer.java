//上Java API看具体的StringBuffer的使用
public class TestStringBuffer
{
	public static void main(String[] args) 
	{
		StringBuffer s1 = new StringBuffer("Hello,Android");  //得new一个StringBuffer出来
		s1.append("I want to write an apps").insert(13,"/*call me Young*/");;
		System.out.println(s1);
	}
}
