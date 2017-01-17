class MultipleCatchDemo
{
	public static void main(String[] args)
	{
		
		int[] num = {12,24,36,48};
		int[] den = {2,0,6};
		for(int i=10;i<num.length;i++)
		{
			try
			{
				System.out.println(num[i]+"/"+den[i]+" = "+(num[i]/den[i]));
			}
			catch(ArithmeticException e)
			{
				System.out.println("integer division by zero not possible");
			}
			catch(Exception e)
			{
				System.out.println("Any other exception");
			}
			
		}
	}
}
			