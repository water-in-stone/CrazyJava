import java.net.*;
import java.io.*;
public class TCPClient 
{
	public static void main(String[] args) 
	{
		try
		{
			Socket s = new Socket("127.0.0.1",6666);//127.0.0.1为本机地址
			String s2 = null;
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			DataInputStream dis = new DataInputStream(s.getInputStream());
			dos.writeUTF("hello,server");
			while ((s2 = dis.readUTF())!= null)
			{
				System.out.println(s2);
			}
			dos.close();
			dis.close();
			s.close();
		}
		catch (UnknownHostException e)
		{
			System.out.println("无法找到地址");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
}
