import java.util.*;
public class TestContain
{
	public static void main(String[] args) 
	{
		/*
		这里属于父类引用指向子类对象，这样c的方法都是属于Collection的，
		日后若有需要把ArrayList改成其他，则可以放心地改。
		*/
		Collection c = new ArrayList(); 
		c.add("hello");
		c.add(new Integer(100));
		c.add(new Name("Android","ios"));
		//相当于调用了c.toString，先输出一个[，再挨个调用各个对象的toString方法
		c.remove("hello");
		c.remove(new Name("Android","ios"));
		System.out.println(c);
		Collection d = new ArrayList();
		d.add(new Name("Android Studio","Xcode"));
		d.add(new Name("Java","swift"));
		Iterator e = d.iterator(); //Iterator是容器都有的一个方法
		while (e.hasNext())
		{
			Name name = (Name)e.next(); //这里next()返回的是Object，则需要强制转化
			System.out.println(name.toString());
		}
		Collection f = new HashSet();
		f.add(new Name("Android Studio","Xcode"));
		f.add(new Name("Java","swift"));
		for (Iterator g = f.iterator();g.hasNext() ; )
		{
			Name name = (Name)g.next();
			if (name.getFirstName().length()<5)  //这里的firstName是private，则需要用getFirstName()
			{
				g.remove();//这里如果用f.remove()则会产生意外，因为Iterator有锁定
			}
		}
		System.out.println(f);
	}
}

class Name
{
	private String firstName,lastName;
	Name(String firstName,String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {return firstName;}
	public String getLastName() {return lastName;}
	public String toString() {return firstName + " "+lastName;}
	public int hashcode() {return firstName.hashCode();}//交给字符串String类的hashCode去处理
	public boolean equals(Object obj)
	{
		if (obj instanceof Name)
		{
			Name name = (Name) obj;  //强制转换为为Name对象，这样才可以用firstName
			return name.firstName == firstName && name.lastName == lastName; 
			//return (fisrtName.equals(name.firstName)) & (lastName.equals(name.lastName));
		}
		else return super.equals(obj);//如果不是Name的实例，则交给父类去处理
	}		
}
