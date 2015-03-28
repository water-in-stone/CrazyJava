class  Person
{
	private String name,location;
	Person(String name,String location)
	{
		this.name = name;
		this.location = location;
	}
	Person(String name)
	{
		this.name = name;
		location = "WenZhou";
	}
	public void info()
	{
		System.out.println("name = " + name + "  "+ "location = " + location);
	}
	
}

class Student extends Person
{
	private String school;
	Student(String name ,String location,String school)
	{
		super(name,location); //直接super()，就代表了Person()
		this.school = school;
	
	}
	Student(String name,String school)
	{
		this(name,"WenZhou",school);
	}
	public void info()
	{
		super.info();
		System.out.println( "  "+"school = " + school);
	}

}

public class TestStudent
{public static void main(String[] args) 
	{
		Person a = new Person("A");
		Person b = new Person("B","NanJing");
		Student c = new Student("C","SEU");
		Student d = new Student("D","HangZhou","HDU");
		a.info();
		b.info();
		c.info();
	    d.info();
	}  
}