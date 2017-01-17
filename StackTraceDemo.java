class StackTraceDemo
{
	static void B()
	{
		int x = 12;
		int y = 0;
		int z=x/y;
	}
	
	static void A()
	{
		B();
	}
	
	public static void main(String[] args)
	{
		A();
	}
}