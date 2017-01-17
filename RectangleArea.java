class Rectangle
{
	int length;
	int breadth;
	
	void setData(int l, int b)
	{
		length=l;
		breadth=b;
	}
	
	int area()
	{
		int rectArea;
		rectArea=length*breadth;
		return rectArea;
	}
	
}

class RectangleArea
{
	public static void main(String[] args)
	{
		
		Rectangle firstRect = new Rectangle();
		firstRect.setData(5,6);
		int result = firstRect.area();
		System.out.println("Area of rectangle = "+result);
	}
	
}