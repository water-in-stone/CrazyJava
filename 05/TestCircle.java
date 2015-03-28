class  Point
{
	private double x,y;
	Point(double _x,double _y)
	{
		x = _x;
		y = _y;
	}

	public double  getX()
		{return x;}	   //ֻҪ�Ƿ�������һ��Ҫ�Ӵ�����
	public double getY()
		{return y;}
	public void setX(double _x) //������set��䣬����Ҫ����ֵ
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
		o = new Point(0.0,0.0);  //nice,����ȷʵ��Ҫ�Լ���ʼ����
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
		{return o;} //���Ƿ���һ������ķ�����ע��Point
	public double getRadius() 
		{return radius;}
	public void setRadius(double _radius)
		{radius = _radius;}
	boolean contains(Point p)  //boolean,contains�õ��ǵ����˳ƣ���������Ӣ��˵����ϰ��
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
		/*����c1.getO.getX�ȷ���һ��Point����o��Ȼ���ٵ���getX��������ջ�ڴ�������һ����ʱ�ı���ָ��o��
		Ȼ������getX�ķ���
		*/
		System.out.println("c1��Բ��" + c1.getO().getX() + "," + c1.getO().getY() + "�뾶" + c1.getRadius());//ע����get()!
		Point p = new Point(2.0,3.0);
		System.out.println(c1.contains(p));
	}

		//ֻҪ���βΣ�ջ�ڴ�ͷ���ռ䣬�������ķ�����ջ�ڴ��еĿռ����ʧ
}