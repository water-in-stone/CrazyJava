import java.util.*;
public class TestMap
{ 
	public static void main(String[ ] args) 
	{
		/*
		Map m1 = new HashMap();
		m1.put("Java",new Integer(1));m1.put("HTML",new Integer(2));
		m1.put("JavaScript",new Integer(3));m1.put("JavaWEB",new Integer(4));
		m1.put("Android",new Integer(486));
		*/
		//JDK1.5֮�������ô�������ˣ����������1,2,4,486ֱ���Զ�����ɶ���,�����ӷ���
		//�ڳ�ʼ����ĵط����ӷ���
		Map<String,Integer> m1 = new HashMap<String,Integer>();
		m1.put("Java",1);m1.put("HTML",2);
		m1.put("JavaScript",3);m1.put("JavaWEB",4);
		m1.put("Android",486);
		System.out.println(m1.size());
		System.out.println(m1.containsKey("Java"));
		if (m1.containsKey("Android"))
		{
			/*����� m1.get()���ص�����ΪObject�����ֵ���������ǿ������ת��(�����˷��ͺ�
			�Ϳ�����ȥǿ������ת��)���Ҷ���һ��Integer�࣬Ӧ��intValue����������Ϊint����
			��ֵ�����������JDK1.5֮������Զ����������ȥintValue(),
			*/
			//int integer = (Integer)m1.get("Android").intValue();
			int integer = m1.get("Android");
			System.out.println(integer);
		}
		Map<String,Integer> m2 = new HashMap<String,Integer>();
		m2.putAll(m1);
		System.out.println(m2);
		}
}
