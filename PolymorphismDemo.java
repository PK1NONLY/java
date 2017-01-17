class Base
{
	public void display()
	{
		System.out.println("Base class display method is called ");
	}
}

class Derv1 extends Base
{
	
	public void display()
	{
		System.out.println("Derv1 class display method is called ");
	}
}

class Derv2 extends Base
{
	public void display()
	{
		System.out.println("Derv2 class display method is called ");
	}
}

class PolymorphismDemo
{
	public static void main(String[] args)
	{
		Base ptr;
		Derv1 d1 = new Derv1();
		Derv2 d2 = new Derv2();
		ptr=d1;
		ptr.display();
		ptr=d2;
		ptr.display();
	}
}