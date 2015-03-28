import java.util.*;
public class TestMap2
{
	public static final int one = 1;
	public static void main(String[ ] args) 
	{
		Map<String,Integer> m1 = new HashMap<String,Integer>();
		for (int i = 0 ;i < args.length;i++ )
		{
			/*
			此处Integer对象会返回null，而null和int 是不可比较的，所以应先把null化为0
			*/
			int freq = m1.get(args[i]) == null ? 0 :m1.get(args[i]);
			m1.put(args[i],(freq == 0 ? one : freq+1));
		}
		System.out.println(m1.size()+ " distinct words is detected");
		System.out.println(m1);
	}
}
