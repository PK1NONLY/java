import java.util.*;
class Equation
{
	public static void main(String[] args)
	{
		double fx,x;
		int a,b;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the interval --> ");
		a=input.nextInt();
		b=input.nextInt();
		for(x=a;x<=b;x+=0.5)
		{
			fx=3*x*x-2*x+1;
			System.out.println("x = "+x+" and fx = "+fx);
		}
	}
}