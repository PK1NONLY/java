class ElectricityBill
{
	private int customerNo;
	private String name;
	private int units;
	
	void setData(int num,String cname,int noUnits)
	{
		customerNo=num;
		name=cname;
		units=noUnits;
	}
	
	void show()
	{
		System.out.println("Customer Number -- "+customerNo);
		System.out.println("Customer Name -- "+name);
		System.out.println("Units Consumed -- "+units);
	}
	
	double billCalculate()
	{
		double bill;
		if(units<100)
			bill=units*1.20;
		else if(units<=300)
			bill=100*1.20+(units-100)*2;
		else
		    bill=100*1.20+2.20*200*2+(units-300)*3;
		return bill;
	}

}

class ElectricityBillDemo
{
public static void main(String[] args)
{

ElectricityBill b = new ElectricityBill();
b.setData(101,"Somesh",200);
double billPay = b.billCalculate();
b.show();
System.out.println("Bill to pay -- "+billPay);

}
}	