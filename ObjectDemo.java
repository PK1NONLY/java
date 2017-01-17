class Test
{
	int num;
	
	Test()
	{
		num=10;
	}
	
	public void increase(Test objRef)
	{
		objRef.num+=1000;
	}
}

class ObjectDemo
{
	public static void main(String[] args)
	{
		
		Test obj = new Test();
		System.out.println("Before increment:num --> "+obj.num);
		obj.increase(obj);
		System.out.println("After increment:num --> "+obj.num);
		
	}
}