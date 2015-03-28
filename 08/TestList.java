import java.util.*;
public class TestList
{
	public static void main(String[ ] args) 
	{
		List why = new LinkedList();
		why.add("Android");why.add("Java");why.add("Python");
		why.add("数据结构和算法");why.add("C");why.add("HTML5+CSS+JavaScript");
		Collections.shuffle(why);
		System.out.println(why);
		/*这里顺便提及一下，LinkedList的reverse比ArrayList的reverse要有效率，因为Linked
		只需要改下指针就可以了，而Array还要复制粘贴
		*/
		Collections.reverse(why);  
		System.out.println(why);
		Collections.sort(why);
		System.out.println(why);
	}
}
