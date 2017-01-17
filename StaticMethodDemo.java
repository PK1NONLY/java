class Account
{
	int accountNo;
	double balance;
	static double rate=0.05;
	
	void setData(int n,double bal)
	{
		accountNo=n;
		balance=bal;
	}
	
	void quarterRateCal()
	{
		double interest = balance*rate*0.25;
		balance+=interest;
	}
	
	static void modifyRate(double incr)
	{
		rate+=incr;
		System.out.println("Modified rate of interest = "+rate);
	}
	
	void show()
	{
		System.out.println("Account number = "+accountNo);
		System.out.println("Rate of interest = "+rate);
		System.out.println("Balance = "+balance);
	}
	
}

class StaticMethodDemo
{
	public static void main(String[] args)
	{
		
		Account acct1 = new Account();
		Account acct2 = new Account();
		
		Account.modifyRate(0.01);
		
		System.out.println("\nCustomer1 information... ");
		acct1.setData(201,1000);
		acct1.quarterRateCal();
		acct1.show();
		
		System.out.println("\nCustomer2 information... ");
		acct2.setData(202,1000);
		acct2.quarterRateCal();
		acct2.show();
		
	}
}