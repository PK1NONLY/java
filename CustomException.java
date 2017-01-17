class InvalidRadiusException extends Exception
{
	InvalidRadiusException()
	{
		super();
	}
	InvalidRadiusException(String message)
	{
		super(message);
	}
}

class Circle
{
	private int radius;
	
	Circle(int r) throws InvalidRadiusException
	{
		setRadius(r);
	}
	public void setRadius(int r) throws InvalidRadiusException
	{
		if(r>=0)
			radius=r;
		else
			throw new InvalidRadiusException("radius cannot be negative");
	}
	public void area()
	{
		System.out.println("Area of circle is = "+(Math.PI*radius*radius));
	}
}

class CustomException
{
	public static void main(String[] args)
	{
		try
		{
			Circle c1 = new Circle(3);
			c1.area();
			
			Circle c2 = new Circle(-5);
			c2.area();
			
			Circle c3 = new Circle(2);
			c3.area();
		}
		
		catch(InvalidRadiusException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
