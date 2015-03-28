public class  ZhiShu
{
	public static void main(String[] args) 
	{
		int c =(int)(Math.sqrt(200));//根号200是最大的除数			
		
		for(int i=101;i<=200;i+=2)
		{
			boolean signal = true;//可以直接在循环里定义变量
			for(int j=2;j<=c;j++)
			{
				if(i % j==0)
				{
					signal = false;
					break;
				}
			}
			if(signal)
			{
				System.out.println(i+"是质数");
			}
		}
	}
}
