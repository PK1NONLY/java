class Rectangle 
{
	int length;
	int breadth;
	
	Rectangle()
	{
		System.out.println("Constructor with zero parameter is called ");
		length=breadth=0;
	}
	
	Rectangle(int side)
	{
		System.out.println("Constructor with one parameter is called ");
		length=breadth=side;
	}
	
	Rectangle(int l,int b)
	{
		length=l;
		breadth=b;
	}
	
	int area()
	{
		return (length*breadth);
	}
	
}

class ConstructorOverload
{
	public static void main(String[] args)
	{
		
		Rectangle r1 = new Rectangle();
		System.out.println("Area of 1st rectangle is = "+r1.area());
		
		Rectangle r2 = new Rectangle(5);
		System.out.println("Area of 2nd rectangle is = "+r2.area());
		
		Rectangle r3 = new Rectangle(7,8);
		System.out.println("Area of 3rd rectangle is = "+r3.area());
		
	}
}