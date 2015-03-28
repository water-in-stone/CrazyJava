import java.io.*;
public class TestBuffer2  
{
	public static void main(String[] args) 
	{
		try
		{
		//此处的关键就在于管道的双层复用，在原先的FileWriter上再套上一层带有缓冲小桶的BufferedWriter
		BufferedWriter bw = new BufferedWriter(new FileWriter("E:/Code/Java/有意思的代码/bak.txt"));
		BufferedReader br = new BufferedReader(new FileReader("E:/Code/Java/有意思的代码/bak.txt"));
		String s = null;
		for (int i =0;i < 100 ;i++ )
		{
			s = String.valueOf(Math.random());
			bw.write(s);
			bw.newLine();
		}
		bw.flush();
		while ((s = br.readLine())!= null)
		{
			System.out.println(s);

		}
		bw.close();//与JDBC的编程一样，程序里打开的IO文件资源不在内存里，所以无法被垃圾回收机制回收，需要关闭
		br.close();
		}
		catch (IOException ioe)  //Java 7 以后，若使用了try语句则可以自动关闭资源
		{
			ioe.printStackTrace();
		}

		System.out.println("");
	}
}
