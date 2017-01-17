class Person
{
	private String name;
	private int age;
	
	Person(String n,int pAge)
	{
		name=n;
		age=pAge;
	}
	
	public String toString()
	{
		return ("name = "+name+"\n"+"age = "+age);
	}
	
}

class Student extends Person
{
	private int rollno;
	private String stuClass;
	private double percentage;
	
	Student(int rno, String n, int page,String c, double p)
	{
		super(n,page);
		rollno=rno;
		stuClass=c;
		percentage=p;
	}
	
	public String toString()
	{
		return("rollno = "+rollno+super.toString()+"class = "+stuClass+" percentage = "+percentage);
	}
	
}
class StudentDemo
{
	public static void main(String[] args)
	{
		
		Student s = new Student(101,"Amit",21,"PGDCA",70.5);
		System.out.println(s.toString());
		
	}
}