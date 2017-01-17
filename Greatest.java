import java.util.*;
class Greatest
{
	public static void main(String[] args)
	{
		int a,b,c,result;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the three numbers : ");
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		result=(a>b)?((a>c)?(a:c) : (b>c)?b:c);
		System.out.println("Result+" is Greatest);
	}
}
		