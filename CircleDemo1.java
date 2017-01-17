class Circle
{
	double radius;
	
	void setData(double r)
	{
		radius=r;
	}
	
	void area()
	{
		double circleArea = Math.PI*radius*radius;
		System.out.println("Area of circle is = "+circleArea);
	}
	
	void cicumference()
	{
		double cir = 2*Math.PI*radius;
		System.out.println("Circumference of circle is = "+cir);
	}
	
}

class CircleDemo1
{
	public static void main(String[] args)
	{
		
		Circle obj = new Circle();
		obj.setData(3.5);
		obj.area();
		obj.cicumference();
		
	}
}