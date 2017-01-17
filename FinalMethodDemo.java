class Base
{
	final void dispaly()
	{
		System.out.println("Base method called");
	}
}

class Derived extends Base
{
	void dispaly()
	{
		System.out.println("Base method called");
	}
}

class FinalMethodDemo
{
	public static void main(String[] args)
	{
		
		Derived d = new Derived();
		d.dispaly();
	}
}