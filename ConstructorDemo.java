class Rectangle
{
	int length;
	int breadth;
	
	Rectangle()
	{
		length=5;
		breadth=6;
	}
	
	int area()
	{
		int rectArea=length*breadth;
		return rectArea;
	}
}

class ConstructorDemo
{
	public static void main(String[] args)
	{
		
		Rectangle firstRect=new Rectangle();
		System.out.println("Area of rectangle is = "+firstRect.area());
		
	}
}