import java.util.*;
class SumNatural
{
	public static void main(String[] args)
	{
		int n,i=1,sum=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number --> ");
		n=input.nextInt();
		do
		{
			sum=sum+1;
			i+=1;
		}
		while(i<=n);
		System.out.println("sum of first "+" numbers = "+sum);
	}
}