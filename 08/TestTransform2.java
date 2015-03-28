import java.io.*;
public class TestTransform2		
{
	public static void main(String[] args) 
	{	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = null;
		try
		{
			s =br.readLine();
			while (s != null)
			{
				if (s.equalsIgnoreCase("exit"))//当出现exit时就退出
				{
					break;
				}
				s  = br.readLine();
				System.out.println(s.toUpperCase());
			}
			br.close();
			isr.close();
		}
		catch (IOException ioe)
		{	
			ioe.printStackTrace();
		}
		
	}
}

