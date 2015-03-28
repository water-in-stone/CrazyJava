class Dog
{
	public String toString()
	{
		return "I'm a violent dog";
	}
}
public class TestToString
{
	public static void main(String[] args)  //主方法不要忘了写
	{
	Dog d = new Dog();
	System.out.println("d = " + d);
	}
} 

