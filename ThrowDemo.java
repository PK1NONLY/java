class ThrowDemo
{
	public double divide(double num,double den)
	{
		
		if(den==0.0)
			throw new ArithmeticException("Denominator cannot be zero");
		else 
			return (num/den);
	}
	
	public static void main(String[] args)
	{
		double x,y,z;
		try
		{
			x=12.5;
			y=0.0;
			z=(x/y);
			System.out.println(x+"/"+y+" = "+z);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}