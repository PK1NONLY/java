import java.util.*;
class SumIndefinite
{
	public static void main(String[] args)
	{
		int num,sum=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numbers(negative numer to quit) --> ");
		while(true)
		{
			num=input.nextInt();
			if(num<0)
				break;
			sum+=num;
		}
		System.out.println("Sum is --> "+sum);
	}
}