import java.util.*;
class Sum
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int a,b,result;
		System.out.println("Enter the first number : ");
		a=input.nextInt();
		System.out.println("Enter the second number : ");
		b=input.nextInt();
		result=a+b;
		System.out.println("Sum of "+a+" + "+b+" = "+result);
	}
}	