import java.io.*;
public class TestPrintStream2
{
	public static void main(String[] args) 
	{
		String f = args[0];
		if (f != null)
		{
			list(f,System.out);
		}
	}
	public static void list (String s,PrintStream fs)
	{
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(s));//BufferedReader管道适合一行行读取
			String r = null;
			while ((r = br.readLine()) != null)
			{
					fs.println(r);//这里的PrintStream就是System.out，所以此处就是System.out.println(r);
			}
			br.close();//记得将管道关闭
		}
		catch(IOException ioe)
		{
			fs.println("无法读取文件");
		}

	}
}
