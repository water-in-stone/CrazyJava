public class  ZhiShu
{
	public static void main(String[] args) 
	{
		int c =(int)(Math.sqrt(200));//����200�����ĳ���			
		
		for(int i=101;i<=200;i+=2)
		{
			boolean signal = true;//����ֱ����ѭ���ﶨ�����
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
				System.out.println(i+"������");
			}
		}
	}
}
