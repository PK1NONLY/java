class Base64
{
	private int num1;
	
	public void setData(int n)
	{
		num1=n;
	}
	
	public int getData()
	{
		return num1;
	}
	
}

class Derived extends Base
{
	int num2;
	
	public void product()
	{
		int num=getData();
		System.out.println("Product = "+(num2*num));
	}
	
	public void derivedShow()
	{
		System.out.println("num2 = "+num2);
	}
	
}

class PrivateInheritance
{
	public static void main(String[] args)
	{
		
		Derived d = new Derived();
		d.setData(20);
		d.num2=10;
		d.product();
		
	}
}