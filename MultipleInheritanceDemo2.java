abstract class Shape
{
	abstract double area();
	abstract double circumference();
}

class Rectangle extends Shape
{
	private double length,breadth;
	
	Rectangle(double x,double y)
	{
		length=x;
		breadth=y;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double getBreadth()
	{
		return breadth;
	}
	
	public double area()
	{
		return (length*breadth);
	}
	
	public double circumference()
	{
		return 2*(length+breadth);
	}
	
}

class Circle extends Shape
{
	private double radius;
	
	Circle(double r)
	{
		radius = r;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double area()
	{
		return (Math.PI*radius*radius);
	}
	
	public double circumference()
	{
		return 2*Math.PI*radius;
	}
	
}

interface CenteredShape
{
	public void setCenter(double x,double y);
	public double getCenterX();
	public double getCenterY();
}

class CenteredRectangle extends Rectangle implements CenteredShape
{
	private double centerx,centery;
	
	public CenteredRectangle(double cx,double cy,double l,double b)
	{
		super(l,b);
		centerx=cx;
		centery=cy;
	}
	
	public void setCenter(double x,double y)
	{
		centerx = x;
		centery = y;
	}
	
	public double getCenterX()
	{
		return centerx;
	}
	
	public double getCenterY()
	{
		return centery;
	}
	
}

class MultipleInheritanceDemo
{
	public static void main(String[] args)
	{
		
		Shape s;
		CenteredRectangle r = new CenteredRectangle(2,3,4,5);
		s=r;
		System.out.println("Area of centered rectangle is = "+s.area());
		
		CenteredRectangle r1 = (CenteredRectangle)s;
		System.out.println("Coordinates are = ("+r1.getCenterX()+", "+r1.getCenterY()+")");
	}
}