import java.io.*;
public class TestObjectIO
{
	public static void main(String[] args) 
	{
		try
		{ 
			FileOutputStream fos = new FileOutputStream("e:/Code/Java/CrazyJava/08/record.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			MyRectangle one = new MyRectangle();
			oos.writeObject(one);//ֱ�Ӱ�������д������ȥ
			oos.flush();
			oos.close();
			FileInputStream fis = new FileInputStream("e:/Code/Java/CrazyJava/08/record.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			MyRectangle two = (MyRectangle)ois.readObject();//����������Object������Ҫ����ǿ������ת��
			System.out.println(two.length +" "+two.width+" "+two.j);
			ois.close();

		}
		catch (ClassNotFoundException ie)
		{
			ie.printStackTrace();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}
//�������Serializable�ӿڣ������޷�������л�����������л�ָ��������������Ӳ���ϴ洢
class MyRectangle implements Serializable 
{
	int length = 10;
	int width = 10;
	transient int j = 6;//transient(͸����,˲���)�����л�ʱ���迼�ǣ����0��
	
}