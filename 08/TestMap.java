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
		//JDK1.5之后可以这么简便地敲了，这里的数字1,2,4,486直接自动打包成对象,且增加泛型
		//在初始定义的地方增加泛型
		Map<String,Integer> m1 = new HashMap<String,Integer>();
		m1.put("Java",1);m1.put("HTML",2);
		m1.put("JavaScript",3);m1.put("JavaWEB",4);
		m1.put("Android",486);
		System.out.println(m1.size());
		System.out.println(m1.containsKey("Java"));
		if (m1.containsKey("Android"))
		{
			/*这里的 m1.get()返回的是作为Object对象的值，则需进行强制类型转换(在有了泛型后
			就可以略去强制类型转换)，且对于一个Integer类，应用intValue方法将其作为int类型
			的值求出来，但在JDK1.5之后可以自动解包，则略去intValue(),
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
