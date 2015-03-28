import java.io.*;
public class TestFileWriter
{
	public static void main(String[ ] args) 
	{
		FileWriter fw = null;
		try
		{
			fw = new FileWriter("E:/Programming/Code/ToyCode/unicode.dat");
			for (int b = 0; b <=60000 ; b++)
			{
				fw.write(b);
			}
			fw.close();
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
			System.out.println("ÎÄ¼þÐ´Èë´íÎó");
			System.exit(-1);
		}
		
	}
}
