public class  Arraycopy
{
	public static void main(String[] args) 
	{
		int[][] a = {{1,3,1},{1,8,15},{5,6}};
		int[][] b = new int[4][];
		System.arraycopy(a,0,b,0,a.length); //ע��arraycopy������java.lang.system�µ�static����������Ҫ��System��arraycopy
		for (int i = 0;i < b.length ;i++ )
		{
			for (int j = 0;j < b[i].length ; j++)
			{
				System.out.println("b[i][j]��ֵ��: "  + b[i][j]);
			}
			
		}
		
	}
}

