import java.io.*;
public class TestTransform1
{
	public static void main(String[] args) 
	{	
		try
		{
			OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:/Code/Java/CrazyJava/08/bak2.txt"));
			osw.write("Android VS IOS");
			System.out.println(osw.getEncoding());
			//此处的true关键字使得写入的“Python”可以接在"Android VS IOS"后面，"ISO8859_1"是我们制定的编码方式，GBK为系统默认
			osw = new OutputStreamWriter(new FileOutputStream ("E:/Code/Java/CrazyJava/08/bak2.txt",true),"ISO8859_1");
			osw.write("Python");
			System.out.println(osw.getEncoding());
			osw.close();
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
		
	}
}

