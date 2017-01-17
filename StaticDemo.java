class Account 
{
	int accountNo;
	double balance;
	
	final static double rate=0.05;
	
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
	
	void show()
	{
		System.out.println("Account number = "+accountNo);
		System.out.println("Rate of interest = "+rate);
		System.out.println("Balance = "+balance);
	}
	
}

class StaticDemo
{
	public static void main(String[] args)
	{
		
		Account acct1 = new Account();
		System.out.println("Customer1 information.... ");
		acct1.setData(201,1000);
		acct1.quarterRateCal();
		acct1.show();
		
		Account acct2 = new Account();
		System.out.println("\nCustomer2 information.... ");
		acct2.setData(202,2000);
		acct2.quarterRateCal();
		acct2.show();
		
	}
}