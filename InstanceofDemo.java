class Shape
{
	public void area()
	{
		System.out.println("Base class area method is called");
	}
	
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
}

class InstanceofDemo
{
	public static void main(String[] args)
	{
		
		Shape s;
		Rectangle r = new Rectangle(10,20);
		s=r;
		
		if(s instanceof Rectangle)
			System.out.println("Contain reference to Rectangle object");
		else
			System.out.println("Contain reference to some other object");
	}
}