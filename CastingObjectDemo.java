class Shape
{
	public void area()
	{
		System.out.println("Base class area is called");
	}
}

class Rectangle extends Shape
{
	double length,breadth;
	
	Rectangle(double x,double y)
	{
		length=x;
		breadth=y;
	}
	
	public double getLength() { return length; }
	public double getBreadth() { return breadth; }
	
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
	
	public double getRadius() { return radius; }
	
	public void area()
	{
		System.out.println("Area of circle is  ="+(Math.PI*radius*radius));
	}
}

class CastingObjectDemo
{
	public static void main(String[] args)
	{
		
		Shape s;
		Rectangle r = new Rectangle(10,20);
		s=r;
		
		System.out.println("Length = "+((Rectangle)s).getLength());
		System.out.println("Breadth = "+((Rectangle)s).getBreadth());
		s.area();
		
		Circle c = new Circle(5);
		s=c;
		
		System.out.println("radius = "+((Circle)s).getRadius());
		s.area();
		
	}
}