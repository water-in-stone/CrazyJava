import java.net.*;
import java.io.*;
public class TCPServer //������server�ˣ�������client��½
{
	public static void main(String[] args) 
	{
		OutputStream os = null;
		InputStream is = null;
		try
		{	
			ServerSocket ss = new ServerSocket(6666);
			Socket socket = ss.accept();//����һ������ʽ�ķ�������û��socket��������
			System.out.println("Server �Ѿ�������");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			DataInputStream dis = new DataInputStream(is);
			DataOutputStream dos = new DataOutputStream(os);
			String s = null;
			while ((s = dis.readUTF())!= null)
			{
				System.out.println(s);
				System.out.println("client's IP address is : " + socket.getInetAddress());
				System.out.println("client's port is " + socket.getPort());
				dos.writeUTF("hello,client");
			}
			dos.writeUTF("hello,client");
			dis.close();
			dos.close();
			socket.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
}