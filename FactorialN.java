import java.util.*;
class FactorialN
{
	public static void main(String[] args)
	{
		int n,fact=1,i;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numbers --> ");
		n=input.nextInt();
		for(i=2;i<=n;i++)
			fact*=i;
		System.out.println("factorial of number "+n+" = "+fact);
	}
}