class SumTwoNum
{
	void sum(int x,int y)
    {
		System.out.println("Sum of two integer numbers = "+(x+y));
	}
	
	void sum(double x,double y)
	{
		System.out.println("Sum of two double numbers = "+(x+y));
	}
	
	void sum(char x,char y)
	{
		System.out.println("Sum of two characters are = "+(x+y));
	}
	
}

class MethodOverLoadDemo
{
	public static void main(String[] args)
	{
		
		SumTwoNum obj = new SumTwoNum();
		obj.sum(10,20);
		obj.sum(7.52,8.14);
		obj.sum('A','B');
		
	}
}
	
