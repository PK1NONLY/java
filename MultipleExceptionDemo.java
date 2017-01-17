class MultipleExceptionDemo
{
	public static void main(String[] args)
	{
		
		int[] num = {12,24,36,48,60,72};
		int[] den = {2,4,0,6};
		for(int i=0;i<num.length;i++)
		{
			try
			{
				System.out.println(num[i]+"/"+den[i]+" = "+num[i]/den[i]);
			}
			catch(ArithmeticException e)
			{
				System.out.println("integer division by zero is not possible");
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array index out of bounds");
			}
			
		}
	}
}