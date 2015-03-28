import java.io.*;
public class  TestFile
{
	public static void main(String[] args) 
	{
		String swparator = File.separator;
		String filename = "myfile.txt";
		String directory = "e:/Code/Java";  //这里推荐用正斜杠/，这样无论在Linux还是Windows下都能成功创建
		File f = new File(directory,filename);
		if (f.exists())  //英文名 exists()
		{
			System.out.println("文件名：" + f.getAbsolutePath());
			System.out.println("文件大小" + f.length());
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

