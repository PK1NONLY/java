import java.util.*;

class DivideByZeroDemo
{
	public static void main(String[] args)
	{
		
		int x,y;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first integer = ");
		x=input.nextInt();
		System.out.println("Enter second integer = ");
		y=input.nextInt();
		System.out.println(x+"/"+y+" = "+(x/y));
		
	}
}