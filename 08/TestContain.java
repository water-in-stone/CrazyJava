import java.util.*;
public class TestContain
{
	public static void main(String[] args) 
	{
		/*
		�������ڸ�������ָ�������������c�ķ�����������Collection�ģ�
		�պ�������Ҫ��ArrayList�ĳ�����������Է��ĵظġ�
		*/
		Collection c = new ArrayList(); 
		c.add("hello");
		c.add(new Integer(100));
		c.add(new Name("Android","ios"));
		//�൱�ڵ�����c.toString�������һ��[���ٰ������ø��������toString����
		c.remove("hello");
		c.remove(new Name("Android","ios"));
		System.out.println(c);
		Collection d = new ArrayList();
		d.add(new Name("Android Studio","Xcode"));
		d.add(new Name("Java","swift"));
		Iterator e = d.iterator(); //Iterator���������е�һ������
		while (e.hasNext())
		{
			Name name = (Name)e.next(); //����next()���ص���Object������Ҫǿ��ת��
			System.out.println(name.toString());
		}
		Collection f = new HashSet();
		f.add(new Name("Android Studio","Xcode"));
		f.add(new Name("Java","swift"));
		for (Iterator g = f.iterator();g.hasNext() ; )
		{
			Name name = (Name)g.next();
			if (name.getFirstName().length()<5)  //�����firstName��private������Ҫ��getFirstName()
			{
				g.remove();//���������f.remove()���������⣬��ΪIterator������
			}
		}
		System.out.println(f);
	}
}

class Name
{
	private String firstName,lastName;
	Name(String firstName,String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {return firstName;}
	public String getLastName() {return lastName;}
	public String toString() {return firstName + " "+lastName;}
	public int hashcode() {return firstName.hashCode();}//�����ַ���String���hashCodeȥ����
	public boolean equals(Object obj)
	{
		if (obj instanceof Name)
		{
			Name name = (Name) obj;  //ǿ��ת��ΪΪName���������ſ�����firstName
			return name.firstName == firstName && name.lastName == lastName; 
			//return (fisrtName.equals(name.firstName)) & (lastName.equals(name.lastName));
		}
		else return super.equals(obj);//�������Name��ʵ�����򽻸�����ȥ����
	}		
}