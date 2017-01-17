import java.util.*;
class Pyramid
{
	public static void main(String[] args)
	{
		int n,i,j;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter how many lines --> ");
		n=input.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.println(i+"");
			}
			System.out.println("\n");
		}
	}
}