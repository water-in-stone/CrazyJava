class Cat
{
	String color;
	int height,age;
	public Cat(String color ,int height,int age)
	{
		this.color = color;
		this.height = height;
		this.age = age;
	}
	public boolean equals(Object obj)
	{
		if(this == obj )
			return true;
		else if(obj instanceof Cat && obj != null)  //instanceof 判断是否为Cat对象或其子类的对象		
		{	
			Cat obj2 = (Cat) obj;  //强制类型转换,因为这里有可能是Cat类的子类
			if(obj2.height == this.height && obj2.age == this.age && obj2.color == this.color )
				return true;
			else return false;
		}
		else return false;
	}
}

public class TestEquals
{
	public static void main(String[] args) 
	{
		Cat a = new Cat("yellow",20,2);
		Cat b = new Cat("red",20,2);
		System.out.println("a猫是否和b猫一样" + a.equals(b));
	}
}
