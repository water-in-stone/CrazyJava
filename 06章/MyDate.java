class Days
{	
	private int day,month,year;
	Days(int month,int day,int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public boolean compare(Days d)
	{
		if(d.year < year )
			return true;
			else if(d.year == year && d.month < month)  //这里注意是要在year相等的情况下再比较月份
				return true;
				else if (d.year == year && d.month == month && d.day <day)
				{
					return true;
				}
				else return false;

	}
	public void print()
	{
		System.out.println("month-day-year:" + month +"-" + day + "-" + year);
	}
}

public class  MyDate
{
	public static void main(String[] args) 
	{
		Days d0 = new Days(4,10,1992);
		Days d1 = new Days(1,15,1992);
		Days d2 = new Days(5,26,1992);
		Days[] d = {d0,d1,d2};
		int length = d.length;
		for (int i = length - 1 ;i >= 1;i-- )   //经典的冒泡排序，每次把最大的数放到一趟循环的最后
		{
			for (int j = 0;j <= i-1 ;j++)
			{
				if(d[j].compare(d[j+1]))
				{
					Days temp = d[j];
					d[j] = d[j+1];
					d[j+1] = temp;
				}
			}
		}
		for (int i = 0 ;i<length ; i++ )
		{
			d[i].print();
		}
		
	}
}
