import java.io.*;
public class TestBuffer2  
{
	public static void main(String[] args) 
	{
		try
		{
		//�˴��Ĺؼ������ڹܵ���˫�㸴�ã���ԭ�ȵ�FileWriter��������һ����л���СͰ��BufferedWriter
		BufferedWriter bw = new BufferedWriter(new FileWriter("E:/Code/Java/����˼�Ĵ���/bak.txt"));
		BufferedReader br = new BufferedReader(new FileReader("E:/Code/Java/����˼�Ĵ���/bak.txt"));
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
		bw.close();//��JDBC�ı��һ����������򿪵�IO�ļ���Դ�����ڴ�������޷����������ջ��ƻ��գ���Ҫ�ر�
		br.close();
		}
		catch (IOException ioe)  //Java 7 �Ժ���ʹ����try���������Զ��ر���Դ
		{
			ioe.printStackTrace();
		}

		System.out.println("");
	}
}