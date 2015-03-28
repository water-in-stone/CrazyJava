abstract class Animals
{
	public String name;
	public abstract void enjoy()  //���󷽷�����Ҫ�г������壬�����AnimalҲ��ɳ�����
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
		super(name);   //���ø���Ĺ��췽��
		this.furColor = furColor;
	}
	public void enjoy()
	{
		System.out.println("������");//��д��Animals��enjoy()����
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
		System.out.println("������");
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
		/*�����ǡ���������ָ��������󡱣�Lady������ʱ��Ҫ����Animals�࣬ʵ���ڹ���ʱȴ�������
		Animals������Cat��Dog
		*/
		Lady Lucy = new Lady("Lucy",Tom);
		Lady Ami = new Lady("Ami",xiaoBai);
		Lucy.myPetEnjoy();  //��̬���ˣ���ʱ�ڳ���ʵ������ʱ��ʵ�ʶ����ָ���enjoy������ʵ��
		Ami.myPetEnjoy();
	}
}
