public class ShuZu
{
	public static void main(String[] args) 
	{
		int[] a = new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			a[i] = Integer.parseInt(args[i]);  //parseInt即可，而不是parseInteger
		}
		int c = a.length;
		int temp = 0;
		for(int gap = c/2;gap > 0;gap /= 2)  //经典的shell排序，gap表示间距，且不断缩减至1
			for(int i = gap;i < c;i++)     //插入排序中用来在元素间移动位置
				for(int j = gap;j >= 0 && a[j] > a[j+gap];j -= gap)   //j-=gap表示前移，每次都要比较到最前面
				{
					 temp = a[j];
					a[j] = a[j+gap];
					a[j+gap] = temp;
				}
       for(int i=0;i<a.length;i++)
		{
		   System.out.print(a[i] + " ");
	    }

	}
}
