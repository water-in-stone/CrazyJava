
class  PointInJava  
{
	 double x,y,z;   //坐标可能有小数点，应改为double
	 PointInJava(double _x,double _y,double _z)   //用_x来更容易理解
	{
		x = _x;
		y = _y;
		z = _z;
	}
	 void setX(double i)
	{
		 x = i;
	}
	  void setY(double j)
	{
		y = j;
	}
	  void setz(double k)
	{
		z = k;
	}
	double getDistance(PointInJava p)
	{
		return Math.sqrt((x - p.x)*(x - p.x) +(y - p.y)*(y - p.y)+(z - p.z)*(z - p.z));

	}

	
	/* double Length(double i,double j,double k)
	{
		double L1 =Math.sqrt(i*i+j*j+k*k);
		return L1;
	}
	*/
}

//写完类以后验证一下
public class Distance
{
	public static void main(String[] args)  //String
	{
		PointInJava p1 = new PointInJava(1,2,3);  //
		PointInJava p2 = new PointInJava(1,2,4);
		/*注意此时在内存中会新建一个p2（里面同样是p2的地址/引用），
		计算出距离后会在栈内存中临时有一个空间存下这个距离值,打印后立即消失
		*/
		System.out.println(p1.getDistance(p2));
		p1.setX(5);
		System.out.println(p1.getDistance(p2));
		//当表达式复杂时，从内向外看。这里在堆内存里先建了一个没有名字的PointInJava类，且getDistance方法在栈内存里临时建一个p指向它
		System.out.println(p1.getDistance(new PointInJava(1,2,3))); 
	}
}