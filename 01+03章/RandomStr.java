class  RandomStr
{
	public static void main(String[] args) 
	{
		String result=""; //ע����String�����ִ�Сд
		for(int i=0;i<6;i++)
		{    /*Math.random����0~1����������,��ע���СдMath.random
			��������Math.sin;Math.pow(3,2)�ȵ�֮���*/
			int value=(int)(Math.random()*26+97);
			result=result+(char)value;   //ע���л���Ӣ�����뷨�ٴ�����
		}
		System.out.println(result);
	}
}
