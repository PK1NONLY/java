class Factorial
{
	public static void main(String[] args)
	{
		int i,j,fact;
		outer:
		for(i=1;i<=10;i++)
		{
			fact=1;
			for(j=1;j<=i;j++)
			{
				if(i>5 && i%2==0)
					continue outer;
				fact=fact*j;
			}
			System.out.println("Factorial of number = "+i+" is = "+fact);
		}
	}
}
