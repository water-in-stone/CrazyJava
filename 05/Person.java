public class Person 
{
	int id;
	int age = 20;
	
	Person(int _id, int _age)  //�ҹ��췽��ǰ��������Ҫ����ֵ�������ڹ��찡�����ﷵ��
	{
		id = _id;
		age = _age;
	}
	public static void main(String[] args) 
	{	/*ջ�������һ��Tom��_id = 1,_age = 25��
		Ȼ���1,25�������ڴ��������ĳ�Ա����id��age�����ջ�ڴ����_id = 1,_age = 25��ʧ*/
		Person Tom = new Person(1,25);  
		Person John = new Person(2,27);
	}
}

class Point
{
	//Point () {};  ������ϵͳĬ�ϰ������ӵĹ��췽��
	int x  ;
	int y  ;
}