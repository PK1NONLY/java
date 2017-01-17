class EnhancedFor
{
	public static void main(String[] args)
	{
		
		int[] num = {5,15,25,30,50};
		for(int i=0;i<num.length;i++)
			System.out.println(num[i]+"");
		
		System.out.println("\nDisplay elements using enhanced for loop --> ");
		for(int i : num)
			System.out.println(i+"");
	}
}