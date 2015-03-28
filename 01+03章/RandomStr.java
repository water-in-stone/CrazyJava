class  RandomStr
{
	public static void main(String[] args) 
	{
		String result=""; //注意是String，区分大小写
		for(int i=0;i<6;i++)
		{    /*Math.random生成0~1间的任意个数,且注意大小写Math.random
			其他包括Math.sin;Math.pow(3,2)等等之类的*/
			int value=(int)(Math.random()*26+97);
			result=result+(char)value;   //注意切换成英文输入法再打括号
		}
		System.out.println(result);
	}
}
