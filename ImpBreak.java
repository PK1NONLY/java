class ImpBreak
{
	public static void main(String[] args)
	{
		System.out.println("show importance of break statement");
		for(int i=1;i<=10;i++)
		{
			System.out.println("i = "+i);
			if(i==5)
			{
				System.out.println("\nBye");
				break;
			}
		}
	}
}