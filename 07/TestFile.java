import java.io.*;
public class  TestFile
{
	public static void main(String[] args) 
	{
		String swparator = File.separator;
		String filename = "myfile.txt";
		String directory = "e:/Code/Java";  //�����Ƽ�����б��/������������Linux����Windows�¶��ܳɹ�����
		File f = new File(directory,filename);
		if (f.exists())  //Ӣ���� exists()
		{
			System.out.println("�ļ�����" + f.getAbsolutePath());
			System.out.println("�ļ���С" + f.length());
		}
		else
		{
			f.getParentFile().mkdirs();
			try
			{
				f.createNewFile();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}

	}
}
