class Vowel
{
	public static void main(String[] args)
	{
		char ch='z';
		switch(ch)
		{
			case 'a': case 'A':
			case 'e': case 'E':
			case 'i': case 'I':
			case 'o': case 'O':
			case 'u': case 'U':
			System.out.println(ch+" is vowel");
			default:
			System.out.println(ch+" is not vowel");
		}
	}
}