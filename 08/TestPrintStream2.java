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
			BufferedReader br = new BufferedReader(new FileReader(s));//BufferedReader�ܵ��ʺ�һ���ж�ȡ
			String r = null;
			while ((r = br.readLine()) != null)
			{
					fs.println(r);//�����PrintStream����System.out�����Դ˴�����System.out.println(r);
			}
			br.close();//�ǵý��ܵ��ر�
		}
		catch(IOException ioe)
		{
			fs.println("�޷���ȡ�ļ�");
		}

	}
}
