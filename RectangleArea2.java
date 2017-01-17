class Rectangle
{
	int length;
	int breadth;
	
}

class RectangleArea2
{
	public static void main(String[] args)
	{
		
		Rectangle firstRect = new Rectangle();
		
		firstRect.length=5;
		firstRect.breadth=6;
		
		int result = firstRect.length*firstRect.breadth;
		
		System.out.println("Area of first rectangle is --> "+result);
		
		Rectangle secondRect = new Rectangle();
		
		secondRect.length=10;
		secondRect.breadth=20;
		
		result = secondRect.length*secondRect.breadth;
		
		System.out.println("Area of second rectangle is --> "+result);
		
	}
	
}