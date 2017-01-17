class Random
{
	static int num[] = new int[5];
	
	{
		System.out.println("Initialization block is executed");
		for(int i=0;i<num.length;i++)
		{
			num[i]=(int)(15*Math.random());
		}
		
	}
	
	void Display()
	{
		for(int i=0;i<num.length;i++)
		{
			System.out.println(""+num[i]);
		}
		
	}
}

class InstanceInitial
{
	public static void main(String[] args)
	{
		
		Random obj1 = new Random();
		System.out.println("\nFor first object values are ... ");
		obj1.display();
		
		Random obj2 = new Random();
		System.out.println("\nFor second object values are ... ");
		obj2.display();
		
	}
}