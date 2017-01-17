class NestedTryDemo
{
	public static void main(String[] args)
	{
		
		int[] num = {12,24,36,48,60,72};
		int[] den = {2,4,0,6};
		
		for(int i=0;i<num.length;i++)
		{
			try
			{
				try
				{
					System.out.println(num[i]+"/"+den[i]+" = "+(num[i]/den[i]));
				}
				catch(ArithmeticException e)
				{
					System.out.println("Inner:integer division by 0 not possible");
				}
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Outer:Array Index Out Of Bounds");
			}
		}
		
	}
}