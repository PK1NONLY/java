class FinallyDemo
{
	public static void main(String[] args)
	{
		int x=12,y=0,z;
		
		try
		{
			z=x/y;
			System.out.println(x+"/"+y+" = "+z);
		}
		catch(ArithmeticException e)
		{
			System.out.println("divide by zero");
		}
		finally
		{
			System.out.println("Inside finally block");
		}
		System.out.println("End of main method");
	}
	
}