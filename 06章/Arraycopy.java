public class  Arraycopy
{
	public static void main(String[] args) 
	{
		int[][] a = {{1,3,1},{1,8,15},{5,6}};
		int[][] b = new int[4][];
		System.arraycopy(a,0,b,0,a.length); //注意arraycopy是属于java.lang.system下的static方法，所以要有System。arraycopy
		for (int i = 0;i < b.length ;i++ )
		{
			for (int j = 0;j < b[i].length ; j++)
			{
				System.out.println("b[i][j]的值是: "  + b[i][j]);
			}
			
		}
		
	}
}

