import java.util.*;
class Menu
{
	public static void main(String[] args)
	{
		int a,b,choice;
		Scanner input = new Scanner(System.in);
		a=input.nextInt();
		b=input.nextInt();
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("Please enter your choice (1-4) -->");
		choice=input.nextInt();
		switch(choice)
		{
			case 1: System.out.println("Sum is --> "+(a+b));
			break;
			case 2: System.out.println("Subtraction is --> "+(a-b));
			break;
			case 3: System.out.println("Multiplication is --> "+(a*b));
			break;
			case 4: System.out.println("Division is --> "+(a/b));
			break;
			default: System.out.println("Invalid number");
		}
	}
}