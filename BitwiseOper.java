class BitwiseOper
{
	public static void main(String[] args)
	{
		short x=20,y=0xaf;
		short z=-24;
		
		System.out.println("x&y --> "+(x&y));
		System.out.println("x|y --> "+(x|y));
		System.out.println("x^y --> "+(x^y));
		System.out.println("z<<2 --> "+(z<<2));
		System.out.println("z>>2 --> "+(z>>2));
		System.out.println("z>>2 --> "+(z>>2));
	}
}