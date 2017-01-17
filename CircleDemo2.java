class Circle 
{
	int x,y;
	int radius;
	
	Circle()
	{
		radius=1;
	}
	
	Circle(int x1,int y1)
	{
		this();
		x=x1;
		y=y1;
	}
	
	Circle(int x1,int y1,int r)
	{
		this(x1,y1);
		radius=r;
	}
	
	void area()
	{
		System.out.println("Area of circle is = "+(Math.PI*radius*radius));
	}
	
}

class CircleDemo
{
	public static void main(String[] args)
	{
		
		Circle c1 = new Circle();
		c1.area();
		
		Circle c2 = new Circle(2,3);
		c2.area();
		
		Circle c3 = new Circle(2,3,4);
		c3.area();
		
	}
}