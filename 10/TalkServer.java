import java.net.*;
import java.io.*;
public class TalkServer
{
	public static void main(String[] args) 
	{
		
		try
		{
			ServerSocket ss = new ServerSocket(5800);
			Socket socket = ss.accept();
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));		
			System.out.println("Clinet: " + br.readLine());
			String line = sin.readLine();
			while (!line.equals("bye"))
			{			
				pw.println(line);
				pw.flush();
				System.out.println("Server: " + line);
				System.out.println("Clinet: " + br.readLine());
				line = br.readLine();
			}
			socket.close();
			ss.close();
			br.close();
			pw.close();
			sin.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
