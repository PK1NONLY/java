class Display{
	int a=6,b=5,c;
	
	Display()
	{
		a=4;
	}
	
	void show()
	{
		System.out.println("Value of a = "+a);
		System.out.println("Value of b = "+b);
		System.out.println("Value of c = "+c);
	}
}

class DisplayDemo
{
	public static void main(String[] args)
	{
		
		Display data = new Display();
		data.show();
		
	}
}