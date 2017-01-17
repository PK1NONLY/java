class Base
{
	int num1;
	
	void baseShow()
	{
		System.out.println("num1 = "+num1);
	}
	
}

class Derived extends Base
{
	int num2;
	
	void product()
	{
		System.out.println("Product = "+(num1*num2));
	}
	
	void derivedShow()
	{
		System.out.println("num2 = "+num2);
	}
}

class InheritanceDemo
{
	public static void main(String[] args)
	{
		
		Derived d = new Derived();
		d.num1=20;
		d.baseShow();
		d.num2=10;
		d.derivedShow();
		d.product();
		
	}
}