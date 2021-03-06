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
		这里用的是自己写的Name类，所以toString方法和compareTo方法都需要
		重写，前者用于打印，后者用于排序
		*/
		Collections.sort(c);
		System.out.println(c); 
	}
}
class Name implements Comparable //在重写compareTo方法前需插入接口Compatable，因为你要实现Comparable接口
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
	//重写equals方法的同时也要重写hashCode，因为在作为索引时用equals()太慢了,得用到hashCode().
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
