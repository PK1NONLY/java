class Person
{
	private String name;
	
	Person(String s)
	{
		setName(s);
	}
	
	public void setName(String s)
	{
		name = s;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void display()
	{
		System.out.println("Name = "+name);
	}
	
}

class Employee extends Person
{
	
	private int empid;
	
	Employee(String sname,int id)
	{
		super(sname);
		setEmpid(id);
	}
	
	public void setEmpid(int id)
	{
		empid = id;
	}
	
	public int getEmpid()
	{
		return empid;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Empid = "+empid);
	}
	
};

class HourlyEmployee extends Employee
{
	private double hourlyRate;
	private int hoursWorked;
	
	HourlyEmployee(String sname,int id,double hr,int hw)
	{
		super(sname,id);
		hourlyRate=hr;
		hoursWorked=hw;
	}
	
	public double GetGrossPay()
	{
		return (hourlyRate*hoursWorked);
	}
	
	public void display()
	{
		super.display();
		System.out.println("Hourly Rate = "+hourlyRate);
		System.out.println("Hours Worked = "+hoursWorked);
		System.out.println("Gross Pay = "+GetGrossPay());
	}
	
};

class MultiLevel
{
	public static void main(String[] args)
	{
		HourlyEmployee emp = new HourlyEmployee("Anshu",101,100,200);
		emp.display();
	}
}