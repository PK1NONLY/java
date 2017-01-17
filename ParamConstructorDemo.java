class Rectangle
{
	int length;
	int breadth;
	
	Rectangle(int l,int b)
	{
		length=l;
		breadth=b;
	}
	
	int area()
	{
		return(length*breadth);
	}
	
}

class ParamConstructorDemo
{
	public static void main(String[] args)
	{
		
		Rectangle firstRect = new Rectangle(5,6);
		System.out.println("Area of first rectangle = "+firstRect.area());
		
		Rectangle secondRect = new Rectangle(7,8);
		System.out.println("Area of second Rectangle = "+secondRect.area());
		
	}
}