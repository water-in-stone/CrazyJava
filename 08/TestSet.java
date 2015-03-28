import java.util.*;
public class TestSet
{
	public static void main(String[] args) 
	{
		Set s1 = new HashSet();
		Set s2 = new HashSet();
		s1.add("Android");s1.add("Unlock");
		s2.add("Android");s2.add("Lock");
		Set sn = new HashSet(s1);
		Set s3 = new HashSet();
		s1.addAll(s2);
		System.out.println(s1);


	}
}
  