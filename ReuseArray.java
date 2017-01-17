class ReuseArray
{
	public static void main(String[] args)
	{
		
		int[] num = {5,15,25,30,50};
		System.out.println("Elements in original Array --> ");
		for(int i=0;i<num.length;i++)
			System.out.println(num[i]+"");
		
		System.out.println("\nElements in new array --> ");
		num=new int[] {10,20,30,40,50,60};
		for(int i=0;i<num.length;i++)
			System.out.println(num[i]+"");
	}
}