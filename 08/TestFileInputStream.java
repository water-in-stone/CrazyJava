import java.io.*;
public class TestFileInputStream
{
	public static void main(String[ ] args) 
	{
		FileInputStream io = null;//���ڶ���������û����ʾ�����������
		try
		{
			io = new FileInputStream("E:/Programming/Code/Java/CrazyJava/08/TestFileInputStream.java");
			
		}
		catch (FileNotFoundException ie)
		{
			System.out.println("�Ҳ���ָ���ļ�");
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
			io.close();//�������رգ�ע����
			System.out.println();
			System.out.print("����" + num + "���ַ�");

		}
		catch (IOException ioe)
		{
			System.out.println("��������");
			System.exit(-1);
		}
	}
}