import java.util.*;
public class TestList
{
	public static void main(String[ ] args) 
	{
		List why = new LinkedList();
		why.add("Android");why.add("Java");why.add("Python");
		why.add("���ݽṹ���㷨");why.add("C");why.add("HTML5+CSS+JavaScript");
		Collections.shuffle(why);
		System.out.println(why);
		/*����˳���ἰһ�£�LinkedList��reverse��ArrayList��reverseҪ��Ч�ʣ���ΪLinked
		ֻ��Ҫ����ָ��Ϳ����ˣ���Array��Ҫ����ճ��
		*/
		Collections.reverse(why);  
		System.out.println(why);
		Collections.sort(why);
		System.out.println(why);
	}
}