class ChainedExceptionDemo
{
	static void B() throws Exception
	{
		throw new Exception("Exception thrown in method B");
	}
	static void A() throws Exception
	{
		try
		{
			B();
		}
		catch(Exception e)
		{
			throw new Exception("Exception thrown in method A",e);
		}
	}
	
	public static void main(String[] args)
	{
		try
		{
			A();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}