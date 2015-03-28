import java.util.*;
public class Generic
{
	public static void main(String[ ] args) 
	{
		//这里new HashSet()中也应加上String，变成new HashSet<String>()，否则编译器会有警告
		Collection<String> c = new HashSet<String>();
		c.add("Android");c.add("MySQL");
		//Iterator必须和Collection联系在一起，所以有 Iterator ie = c.iterator()；
		for (Iterator<String> ie = c.iterator();ie.hasNext() ; )
		{
			String i = ie.next();
		    System.out.println(i);
		}
	}
}
