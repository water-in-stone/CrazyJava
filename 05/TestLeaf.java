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
		//return Leaf;����ķ���ֵû�����֣�������Ҫ�ľ��Ƿ�������������this��
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
