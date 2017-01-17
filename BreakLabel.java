class BreakLabel
{
	public static void main(String[] args)
	{
		int n,i,j;
		outer:
		for(i=1;i<=15;i++)
		{
			for(j=5;j<=10;j++)
			{
				if(i*j>12)
					break outer;
				System.out.println(i+" * "+j+" = "+(i*j));
			}
		}
	}
}