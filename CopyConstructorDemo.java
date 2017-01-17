class Rectangle
{
	int length;
	int breadth;
	
	Rectangle(int l,int b)
	{
		length=l;
		breadth=b;
	}
	
	Rectangle(Rectangle obj)
	{
		System.out.println("Copy constructor invoked ");
		length=obj.length;
		breadth=obj.breadth;
	}
	
	int area()
	{
		return (length*breadth);
	}
	
}

class CopyConstructorDemo
{
	public static void main(String[] args)
	{
		
		Rectangle firstRect = new Rectangle(5,6);
		System.out.println("Area of first rectangle = "+firstRect.area());
		
		Rectangle secondRect = new Rectangle(firstRect);
		System.out.println("Area of second rectangle = "+secondRect.area());
		
	}
}