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
			�˴�Integer����᷵��null����null��int �ǲ��ɱȽϵģ�����Ӧ�Ȱ�null��Ϊ0
			*/
			int freq = m1.get(args[i]) == null ? 0 :m1.get(args[i]);
			m1.put(args[i],(freq == 0 ? one : freq+1));
		}
		System.out.println(m1.size()+ " distinct words is detected");
		System.out.println(m1);
	}
}
