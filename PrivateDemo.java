class Rectangle
{
	private int length;
	private int breadth;
	
	private static int rectCount=0;
	
	Rectangle(int l,int b)
	{
		length=(l>=0)?l:0;
		breadth=(b>=0)?b:0;
		rectCount++;
	}
	
	static int count()
	{
		return rectCount;
	}
	
	int getLength()
	{
		return length;
	}
	
	int getBreadth()
	{
		return breadth;
	}
	
	public int area()
	{
		int rectArea;
		rectArea=length*breadth;
		return rectArea;
	}
}

class PrivateDemo
{
	public static void main(String[] args)
	{
		
		Rectangle firstRect = new Rectangle(2,3);
		System.out.println("Length = "+firstRect.getLength());
		System.out.println("Breadth = "+firstRect.getBreadth());
		System.out.println("Area of rectangle is = "+firstRect.area());
		System.out.println("Number of object created = "+Rectangle.count());
		
	}
}
		