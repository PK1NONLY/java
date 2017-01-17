import java.util.*;
class SumDigits
{
	public static void main(String[] args)
	{
		long num,x,sum=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number --> ");
		num=input.nextInt();
		while(num>0)
		{
			x=num%10;
			sum+=x;
			num/=10;
		}
		System.out.println("Sum of digits of number is -->"+sum);
	}
}