import java.io.*;
public class TestFileOutputStream
{
	public static void main(String[ ] args) 
	{
		FileOutputStream out = null;
		FileInputStream in = null;
		int b = 0;
		try
		{
			in = new FileInputStream("E:/Programming/Code/Java/����˼�Ĵ���/Fibonacci.java");
			out = new FileOutputStream("E:/Programming/Code/ToyCode/Fibonacci.java");
			while ((b = in.read()) != -1)
			{
				out.write(b);
			}
			in.close();//�رչܵ�
			out.close();			
		}
		//������catch����˳��ģ�����FileNotFoundException������IOException�����򲻷��ϳ���
		catch (FileNotFoundException fie) 
		{
			System.out.println("�Ҳ���ָ�����ļ�");
			System.exit(-1);
		}
		catch (IOException ioe)
		{
			System.out.println("ϵͳ����");
			System.exit(-1);
		}
		
		System.out.println("�ļ��Ѹ���");
	}
}

/*��ʼ����������ļ�����ÿ��һ��ʱ
 �����out�ļ����У���ɺ�ر�
 �������쳣��Ҫ����
*/