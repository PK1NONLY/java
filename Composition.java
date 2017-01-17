class Date
{
	private int day;
	private int month;
	private int year;
	
	Date(int dd,int mm,int yy)
	{
		System.out.println("Constructor of date class is called");
		day=dd; month=mm; year=yy;
	}
	
	public String toString()
	{
		return (day+"/"+month+"/"+year);
	}
}

class Employee
{
	private int id;
	private String name;
	private Date hireDate;
	
	Employee(int num,String n,Date hire)
	{
		System.out.println("Constructor of Employee class is called");
		id=num;
		name=n;
		hireDate=hire;
	}
	
	public void display()
	{
		System.out.println("id = "+id);
		System.out.println("Name = "+name);
		System.out.println("Hire Date = "+hireDate);
	}
}

class Composition
{
	public static void main(String[] args)
	{
		
		Date d = new Date(12,11,2000);
		Employee emp = new Employee(101,"Amit",d);
		emp.display();
	}
}