import java.util.*;
public class TestComparable
{
	public static void main(String[ ] args) 
	{
		List<Name> c = new LinkedList<Name>();
		c.add(new Name("Young","Wang"));
		c.add(new Name("Jun","Qian"));
		System.out.println(c);
		/*
		�����õ����Լ�д��Name�࣬����toString������compareTo��������Ҫ
		��д��ǰ�����ڴ�ӡ��������������
		*/
		Collections.sort(c);
		System.out.println(c); 
	}
}
class Name implements Comparable //����дcompareTo����ǰ�����ӿ�Compatable����Ϊ��Ҫʵ��Comparable�ӿ�
{
	private String firstName,lastName;
	public String toString(){return firstName + " " + lastName;}
	Name(String firstName,String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public boolean equals(Object obj)
	{
		if (obj instanceof Name)
		{
			Name name = (Name)obj;
			return name.firstName == firstName && name.lastName == lastName;
		}
		else return super.equals(obj);
	}
	//��дequals������ͬʱҲҪ��дhashCode����Ϊ����Ϊ����ʱ��equals()̫����,���õ�hashCode().
	public int hashCode()  
	{
		return firstName.hashCode();
	}
	public int compareTo(Object obj)
	{
		Name name = (Name) obj;
		int result = lastName.compareTo(name.lastName);
		return result !=0 ? result : firstName.compareTo(name.firstName);
	}
	
}