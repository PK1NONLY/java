import java.io.IOException;

class ThrowsDemo
{
	static boolean guess() throws IOException
	{
		char ch = 'r';
		System.out.println("Guess any character(a-z) --> ");
		char n = (char)System.in.read();
		return (ch==n);
	}
	public static void main(String[] args)
	{
		boolean result;
		try
		{
			result = guess();
			if(result==true)
				System.out.println("Your guess is perfect");
			else
				System.out.println("Your guess is incorrect");
		}
		catch(Exception e)
		{
			System.out.println("error may be occurred in input");
		}
		
	}
}