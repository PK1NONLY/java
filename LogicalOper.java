class LogicalOper
{
	public static void main(String[] args)
	{
		int x=6,y=7,z=5;
		System.out.println("x>y & y>z --> "+(x>y & y>z));
		System.out.println("x>y | y>z --> "+(x>y | y>z));
		System.out.println("x>y ^ y>z --> "+(x>y ^ y>z));
		System.out.println("x>y && y>z --> "+(x>y && y>z));
		System.out.println("x>y || y>z --> "+(x>y || y>z));
		System.out.println("!(x>y) --> "+(!(x>y)));
	}
}