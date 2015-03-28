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
			//sin�൱����Ļ�������Ĺܵ�����������
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));	
			String line = sin.readLine();
			while (!line.equals("bye"))
			{
				System.out.println("Client: " + line);
				//����Ӧʹ��PrintWriter��println���ܣ���line��������Ϊ����ܵ��䵽server��
				pw.println(line);
				pw.flush();//��Ϊ�л��������Ӧ��պ���ʹ��
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