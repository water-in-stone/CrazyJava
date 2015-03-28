class  Point
{
	private double x,y;
	Point(double _x,double _y)
	{
		x = _x;
		y = _y;
	}

	public double  getX()
		{return x;}	   //只要是方法，就一定要加大括号
	public double getY()
		{return y;}
	public void setX(double _x) //这里是set语句，不需要返回值
		{x = _x;}
	public void setY(double _y)
		{y = _y;}

}

class Circle
{
	private Point o;
	private double radius;

	Circle(double _radius)
	{
		radius = _radius;
		o = new Point(0.0,0.0);  //nice,这里确实是要自己初始化的
	}

	Circle(Point p,double _radius)
	{
		o = p;
		radius = _radius;
	}

	public void setPoint(double x , double y)
	{
		o.setX(x);
		o.setY(y);
	}

	public double area()
		{return 3.14 * radius * radius;}
	public Point getO()
		{return o;} //这是返回一个对象的方法！注意Point
	public double getRadius() 
		{return radius;}
	public void setRadius(double _radius)
		{radius = _radius;}
	boolean contains(Point p)  //boolean,contains用的是第三人称，这样符合英文说话的习惯
	{
		double x1 = o.getX() - p.getX();
		double y1 = o.getY() - p.getX();
		if( (x1 * x1 + y1 * y1) <= radius * radius)
		{
			return true;
		}
		else return false;
	}

}

public class TestCircle
{
	public static void main(String[] args )
	{
		Circle c1 = new Circle(5.0);
		Circle c2 = new Circle(new Point(1.0,2.0),2.0);
		/*这里c1.getO.getX先返回一个Point对象o，然后再调用getX方法，在栈内存中先有一个临时的变量指向o，
		然后再用getX的方法
		*/
		System.out.println("c1的圆心" + c1.getO().getX() + "," + c1.getO().getY() + "半径" + c1.getRadius());//注意是get()!
		Point p = new Point(2.0,3.0);
		System.out.println(c1.contains(p));
	}

		//只要有形参，栈内存就分配空间，且用完后的方法在栈内存中的空间就消失
}
