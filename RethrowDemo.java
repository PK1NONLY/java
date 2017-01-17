class ReThrowDemo
{
	static void divide()
	{
		int x,y,z;
		
		try
		{
			x=12;
			y=0;
			z=(x/y);
			System.out.println(x+"/"+y+" = "+z);
		}
		catch(Exception e)
		{
			System.out.println("Exception caught in divide()");
			System.out.println("cannot divide by zero in integer division");
			throw e;
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("Start of main()");
		try
		{
			divide();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Rethrown exception caught in main()");
		}
		
	}
}