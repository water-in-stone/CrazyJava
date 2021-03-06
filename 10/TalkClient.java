import java.net.*;
import java.io.*;
public class TalkClient
{
	public static void main(String[] args) 
	{
		try
		{
			Socket socket = new Socket("127.0.0.1",5800);
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			//sin相当于屏幕戳向程序的管道，便于输入
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));	
			String line = sin.readLine();
			while (!line.equals("bye"))
			{
				System.out.println("Client: " + line);
				//这里应使用PrintWriter的println功能，把line的内容作为输出管道输到server端
				pw.println(line);
				pw.flush();//作为有缓冲的流，应清空后再使用
				System.out.println("Server: " + br.readLine());	
				line = sin.readLine();

			}
			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
