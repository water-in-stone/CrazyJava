class  Person
{
	int id,age;
	Person()   
	{
		 id = 0;
		 age = 20;
	} 
	Person(int _id)   //对构造方法进行重载，形参不同即可
	{
		 age = 20;
		 id =_id;
	}
	Person(int _id,int _age)
	{
		age = _age;
		id = _id;
	}
}
public class OverLoad
{
	public static void main(String [] args)
	{
		Person yoda = new Person();
		Person james = new Person(2);
		Person john = new Person(2,22);

	}

} 
