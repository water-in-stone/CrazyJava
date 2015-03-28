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
		else if(obj instanceof Cat && obj != null)  //instanceof �ж��Ƿ�ΪCat�����������Ķ���		
		{	
			Cat obj2 = (Cat) obj;  //ǿ������ת��,��Ϊ�����п�����Cat�������
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
		System.out.println("aè�Ƿ��bèһ��" + a.equals(b));
	}
}