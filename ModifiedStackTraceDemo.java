class ModifiedStackTraceDemo
{
	static void B()
	{
		int x =12;
		int y = 0;
		int z = x/y;
		System.out.println("z = "+z);
	}
	
	static void A()
	{
		B();
	}
	
	public static void main(String[] args)
	{
		try
		{
			A();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Integer division by 0 not possible,try again\n");
			System.out.println("Stack trace information... \n");
			e.printStackTrace();
		}
	}
	
}