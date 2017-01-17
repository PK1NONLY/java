class ThrowableMthodsDemo
{
	static void A()
	{
		int x = 12;
		int y =0;
		int z = x/y;
	}
	
	public static void main(String[] args)
	{
		try
		{
			A();
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Displaying stack trace information... ");
		e.printStackTrace();
		System.out.println("\nDescription of the exception : "+e.getMessage());
		System.out.println("\nString containing description of the exception");
		System.out.println(e.toString());
		}
		
	}
}