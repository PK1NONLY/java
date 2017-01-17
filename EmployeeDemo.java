interface Payroll
{
	public void computePay(int daysWorked);
	public double getPay();
}

interface EmployeeInfo
{
	public void setName(String n);
	public String getName();
	public void setAddress(String add);
	public String getAddress();
}

class Employee implements Payroll,EmployeeInfo
{
	private String name;
	private String address;
	private double salary;

	Employee(String n,String add)
	{
		name = n;
		address = add;
	}
	
	public void setName(String n) 
	{ 
	name = n;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setAddress(String add)
	{
		address = add;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void computePay(int daysWorked)
	{
		salary = daysWorked*500;
	}
	public double getPay()
	{
		return salary;
	}
	
}

class EmployeeDemo
{
	public static void main(String[] args)
	{
		
		Employee e = new Employee("Kapil","24,Rani ka Bagh,Amritsar");
		Payroll p = e;
		EmployeeInfo ei = e;
		System.out.println("Employee details are");
		System.out.println("Name = "+ei.getName());
		System.out.println("Address = "+ei.getAddress());
		p.computePay(28);
		System.out.println("Salary = "+p.getPay());
		
	}
}