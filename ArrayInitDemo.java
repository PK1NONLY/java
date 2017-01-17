class ArrayInitDemo
{
	public static void main(String[] args)
	{
		
		int[] num = new int[]{5,15,25,30,50};
		for(int i=0;i<num.length;i++)
			System.out.println("num["+i+"] = "+num[i]);
		
		display(new String[] {"apple","orange","litchi"});
	}
	
	static void display(String[] str)
	{
		for(int i=0;i<str.length;i++)
			System.out.println("str["+i+"] = "+str[i]);
	}
}