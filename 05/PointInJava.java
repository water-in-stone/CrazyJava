
class  PointInJava  
{
	 double x,y,z;   //���������С���㣬Ӧ��Ϊdouble
	 PointInJava(double _x,double _y,double _z)   //��_x������������
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

//д�����Ժ���֤һ��
public class Distance
{
	public static void main(Spring[] args)
	{
		PointInJava p1 = new PointInJava(1,2,3);
		PointInJava p2 = new PointInJava(1,2,4);
		System.out.println(p1.getDistance(p2));
		p1.setX(5);
		System.out.println(p1.getDistance(p2));
	}
}