class Rectangle 
{
	int length;
	int breadth;
	
	static int rectCount=0;
	
	void setData(int l,int b)
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

class StaticFieldDemo
{
	public static void main(String[] args)
	{
		
		Rectangle obj1 = new Rectangle();
		obj1.setData(5,6);
		System.out.println("Area of 1st rectangle = "+obj1.area());

        Rectangle obj2 = new Rectangle();
        obj2.setData(10,20);
        System.out.println("Area of 2nd rectangle = "+obj2.area());
		
		System.out.println("Total number of objects = "+Rectangle.rectCount);

    }
}	