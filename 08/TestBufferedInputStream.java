import java.io.*;
public class TestBufferedInputStream
{
	public static void main(String[] args) 
	{
		try
		{
		FileInputStream fis = new FileInputStream("E:/Code/Java/CrazyJava/08/TestList.java");		
		BufferedInputStream bis = new BufferedInputStream(fis);
		System.out.println(bis.read());
		bis.mark(5);
		int c = 0;
		for (int i = 0;i<10 && (c = bis.read()) != -1 ;i++ )
		{
			System.out.print((char)c + " ");
		}
		bis.reset();
		for (int i = 0;i<10 && (c = bis.read()) != -1 ;i++ )
		{
			System.out.print(c + " ");
		}
		bis.close();
		}
		catch (IOException ioe) 
		{
		ioe.printStackTrace();
		}
	}

}

