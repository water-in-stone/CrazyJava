class Leaf  
{
	int i;
	Leaf(int i)
	{
		this.i = i;
	}
	Leaf increment()
	{
		i++;
		return this;
		//return Leaf;这里的返回值没有名字，但我们要的就是返回自身，所以用this！
	}
	void print()
	{System.out.println("i = "+ i );}
	

}
public class TestLeaf
{
	public static void main(String[] args) 
	{
		Leaf example = new Leaf(100);
		example.increment().increment().print();
	}
}
