interface LengthConversionUnits
{
	double FEET_TO_INCH = 12.0;
	double FEET_TO_Metre = 0.3048;
	double KM_TO_MILES = 062137;
	double KM_TO_NAUTMILES = 0.53996;
}

interface LengthConversions extends LengthConversionUnits
{
	double feetToInches(double f);
	double feetToMetres(double f);
	double kmToMiles(double k);
	double kmToNautMiles(double k);
}

class Conversation implements LengthConversions
{
	public double feetToInches(double f)
	{
		return f*FEET_TO_INCH;
	}
	
	public double feetToMetres(double f)
	{
		return f*FEET_TO_Metre;
	}
	
	public double kmToMiles(double k)
	{
		return k*KM_TO_MILES;
	}
	
	public double kmToNautMiles(double k)
	{
		return k*KM_TO_NAUTMILES;
	}
	
}

class ConversionDemo
{
	public static void main(String[] args)
	{
		
		Conversation c1 = new Conversation();
		System.out.println("6.5 feet = "+c1.feetToInches(6.5)+" inches");
		System.out.println("12.3 km = "+c1.kmToMiles(12.3)+" miles");
		
	}
}