interface Interface1
{
	void f1();
}

interface Interface2
{
	void f2();
}

class X implements Interface1,Interface2
{
	public void f1()
	{
		System.out.println("Content of method f1() in Interface1");
	}
	
	public void f2()
	{
		System.out.println("Content of method f2() in Interface2");
	}
	
	public void f3()
	{
		System.out.println("Content of method f3() in Interface3");
	}
}

class MultipleInterfaceDemo
{
	public static void main(String[] args)
	{
		Interface1 v1;
		v1=new X();
		v1.f1();
		Interface2 v2;
		v2=new X();
		v2.f2();
		X x1=new X();
		x1.f3();
	}
}
		