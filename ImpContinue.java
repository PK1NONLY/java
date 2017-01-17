class ImpContinue
{
	public static void main(String[] args)
	{
		System.out.println("Show importance of continue statement");
		for(int m=1;m<=3;m++)
		{
			for(int n=1;n<=2;n++)
			{
				if(m==n)
					continue;
				System.out.println("m = "+m+" n = "+n);
			}
		}
	}
}