interface Shape
{
	double area();
	double circumference();
}

class Rectangle implements Shape
{
	private double length,breadth;
	
	public Rectangle(double l,double b)
	{
		length=l;
		breadth=b;
	}
	
	public double area()
	{
		return length*breadth;
	}
	
	public double circumference()
	{
		return 2*(length+breadth);
	}
	
}

class Circle implements Shape
{
	public static final double PI = 3.142;
	private double radius;
	
	public Circle(double r)
	{
		radius = r;
	}
	
	public double area()
	{
		return Math.PI*radius*radius;
	}
	
	public double circumference()
	{
		return 2*Math.PI*radius;
	}
	
}

class InterfaceDemo
{
	public static void main(String[] args)
	{
		
		Shape[] s = new Shape[2];
		s[0] = new Rectangle(10,20);
		s[1] = new Circle(3);
		
		double total_area = 0;
		for(int i = 0;i<s.length;i++)
		{
			System.out.println("Area = "+s[i].area());
			System.out.println("Circumference = "+s[i].circumference());
		}
		
	}
}