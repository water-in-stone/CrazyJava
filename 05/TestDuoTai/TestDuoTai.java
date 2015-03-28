abstract class Animals
{
	public String name;
	public abstract void enjoy()  //抽象方法不需要有程序主体，且这个Animal也变成抽象类
	Animals (String name)
	{
		this.name = name;
	}
}

class Cat extends Animals
{
	private String furColor;
	Cat(String name,String furColor)
	{
		super(name);   //调用父类的构造方法
		this.furColor = furColor;
	}
	public void enjoy()
	{
		System.out.println("喵喵喵");//重写了Animals的enjoy()方法
	}
}

class Dog extends Animals
{
	private String furColor;
	Dog(String name,String furColor)
	{
		super(name);
		this.furColor = furColor;
	}
	public void enjoy() 
	{
		System.out.println("汪汪汪");
	}

}

class Lady
{
	private String name;
	private Animals pet;
	Lady (String name,Animals pet)
	{
		this.name = name;
		this.pet = pet;
	}
	public void myPetEnjoy()
	{
		pet.enjoy();
	}
}


public class TestDuoTai
{
	public static void main(String[] args) 
	{
		Cat Tom = new Cat("Tom","blue");
		Dog xiaoBai = new Dog("xiaoBai","white");
		/*下面是“父类引用指向子类对象”，Lady对象构造时需要的是Animals类，实际在构造时却传入的是
		Animals的子类Cat和Dog
		*/
		Lady Lucy = new Lady("Lucy",Tom);
		Lady Ami = new Lady("Ami",xiaoBai);
		Lucy.myPetEnjoy();  //多态来了，这时在程序实际运行时以实际对象的指向的enjoy方法来实现
		Ami.myPetEnjoy();
	}
}
