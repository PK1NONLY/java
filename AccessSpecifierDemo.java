class Rectangle
{
	public int length;
	public int breadth;
	
	static int rectCount=0;
	
	Rectangle()
	{
		rectCount++;
	}
	
	public int area()
	{
		int rectArea;
		rectArea=length*breadth;
		return rectArea;
	}
	
}

class AccessSpecifierDemo
{
	public static void main(String[] args)
	{
		
		Rectangle firstRect = new Rectangle();
		
		firstRect.length=-10;
		firstRect.breadth=-20;
		System.out.println("Area of rectangle is = "+firstRect.area());
		
		System.out.println("Number of object created = "+Rectangle.rectCount);
		
	}
	
}