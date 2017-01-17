import java.util.*;

class TryCatchDemo
{
public static void main(String[] args)
{
	
	int x,y;
	
	Scanner input = new Scanner(System.in);
	
	try
	{
		System.out.println("try block entered");
		System.out.println("Enter first integer = ");
		x=input.nextInt();
		System.out.println("Enter second integer = ");
		y=input.nextInt();
		System.out.println(x+"/"+y+" = "+(x/y));
		System.out.println("try block ended");
	}
	
	catch(ArithmeticException e)
	{
		System.out.println("Denominator cannot be zero while integer division");
	}
	System.out.println("Statements after try catch block");

}
}