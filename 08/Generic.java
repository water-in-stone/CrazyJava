import java.util.*;
public class Generic
{
	public static void main(String[ ] args) 
	{
		//����new HashSet()��ҲӦ����String�����new HashSet<String>()��������������о���
		Collection<String> c = new HashSet<String>();
		c.add("Android");c.add("MySQL");
		//Iterator�����Collection��ϵ��һ�������� Iterator ie = c.iterator()��
		for (Iterator<String> ie = c.iterator();ie.hasNext() ; )
		{
			String i = ie.next();
		    System.out.println(i);
		}
	}
}