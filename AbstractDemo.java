abstract class Shape
{
	abstract void area();
	abstract void circumference();
}

class Rectangle extends Shape
{
	private double length,breadth;
	
	Rectangle(double x,double y)
	{
		length=x;
		breadth=y;
	}
	
	public void area()
	{
		System.out.println("Area of rectangle is = "+(length*breadth));
	}
	
	public void circumference()
	{
		System.out.println("Circumference of rectangle is = "+(2*(length+breadth)));
	}
}

class Circle extends Shape
{
	private double radius;
	
	Circle(double r)
	{
		radius=r;
	}
	
	public void area()
	{
		System.out.println("Area of circle is = "+(Math.PI*radius*radius));
	}
	
	public void circumference()
	{
		System.out.println("Circumference of circle is = "+(2*Math.PI*radius));
	}
}

class AbstractDemo
{
	public static void main(String[] args)
	{
		
		Shape s;
		
		Rectangle r = new Rectangle(10,20);
		s=r;
		s.area();
		s.circumference();
		
		Circle c = new Circle(5);
		s=c;
		s.area();
		s.circumference();
		
	}
}