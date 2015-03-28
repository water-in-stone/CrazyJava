import java.io.*;
public class TestPrintStream
{
	public static void main(String[] args) 
	{
		try 
		{FileOutputStream fos = new FileOutputStream("e:/Code/Java/CrazyJava/08/log.dat");
		PrintStream ps = new PrintStream(fos);
		if (ps != null)
		{
			System.setOut(ps);//此处的setOut方法把原先指向DOS的输出流指向了文件log.dat
		}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
		int in=0;
		for (int i = 0;i < 60000 ;i++ )
		{
			System.out.print((char)i);
			in++;
			if (in >= 100)
			{
				in = 0;
				System.out.println();
			}
		}
		System.out.println("Hello World!");
	}
}
