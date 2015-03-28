class  FatherClass
{
	public int value = 100;
	public void f()
	{
		System.out.println("value=" + value);
	}
}

class SonClass extends FatherClass
{
	public int value;
	public void f()
	{
		value = 200;
		System.out.println("value=" + value);
		System.out.println("fatherclass's value=" + super.value);
	}
}

public class TestOverRide
{
	public static void main(String[] args) 
	{
		SonClass son = new SonClass();
		son.f();
	}
}
