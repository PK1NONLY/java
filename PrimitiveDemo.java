class PrimitiveDemo
{
	public static void increased(int n)
	{
		
		n+=1000;
		System.out.println("Increased number:n --> "+n);
	}
	
	public static void main(String[] args)
	{
		
		int num = 10;
		System.out.println("Before increment:num --> "+num);
		increased(num);
		System.out.println("After increment:num --> "+num);
		
	}
}