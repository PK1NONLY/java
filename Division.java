import java.util.*;
class Division
{
	public static void main(String[] args)
	{
		double a,b,c,per;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the three numbers : ");
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		per=(a+b+c)/3;
		System.out.println("Percentage is "+per);
		if(per>=60)
			System.out.println("First Division");
		else if(per>=50 & per<60)
			System.out.println("Second Division");
		else if(per>=35 & per<50)
			System.out.println("Third Division");
		else
			System.out.println("Improvement Required");
	}
}