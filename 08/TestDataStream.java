import java.io.*;
public class TestDataStream
{
	public static void main(String[] args) 
	{
		//��γ��������ڴ�ͼ���ʼ�
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos);
		try
		{
			dos.writeDouble(Math.random());
			dos.writeBoolean(true);
			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			DataInputStream dis = new DataInputStream(bais);
			System.out.println(bais.available());
			System.out.println(dis.readDouble());//�ڴ�����һ�����У������ȳ���������д����double�����ȴ�ӡdouble
			System.out.println(dis.readBoolean());
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
		
	}
}