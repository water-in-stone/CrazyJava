import java.io.*;
public class TestFileInputStream
{
	public static void main(String[ ] args) 
	{
		FileInputStream io = null;//存在读出的中文没法显示正常这个问题
		try
		{
			io = new FileInputStream("E:/Programming/Code/Java/CrazyJava/08/TestFileInputStream.java");
			
		}
		catch (FileNotFoundException ie)
		{
			System.out.println("找不到指定文件");
			System.exit(-1);
		}
		try
		{
			long num = 0;
			int b;
			while ((b = io.read()) != -1)
			{
				System.out.print((char)b);
				num++;
			}
			io.close();//这里必须关闭，注意了
			System.out.println();
			System.out.print("共有" + num + "个字符");

		}
		catch (IOException ioe)
		{
			System.out.println("输入有误");
			System.exit(-1);
		}
	}
}
