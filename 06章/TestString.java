public class  TestString
{
	public static void main(String[] args) 
	{
		String s1 = new String ("hello,Android&Java");
		System.out.println(s1.charAt(10));
		double d1 = 523464427.645788;
		String s2 = String.valueOf(d1);  //String �౾����Ѿ���ǰ������ˣ�ֱ����String.valueOf()�ͺ�
		System.out.println("d1��λ����" + s2.length());    //  Ӧ��s2.length()
		String s3 = "Talk is chief,show me your code";
		String[] s4 = s3.split(",");
		for (int i = 0;i < s4.length; i++ )   //����ļ��㳤�ȵķ�����s4.length
		{
			System.out.println(s4[i]);
		}
		
	}
}
