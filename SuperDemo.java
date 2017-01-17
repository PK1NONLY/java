class Point
{
	private int x,y,z;
	
	Point(int x1,int y1,int z1)
	{
		System.out.println("Super class constructor is invoked");
		x=x1;
		y=y1;
		z=z1;
	}
	
	public int getX() { return x; }
	public int getY() { return y; }
	public int getZ() { return z; }
	
}

class Sphere extends Point
{
	private int radius;
	
	Sphere(int x1,int y1,int z1,int r)
	{
	super(x1,y1,z1);
	System.out.println("Derived class constructor is invoked");
	radius=r;
	}

public int getRadius() { return radius; }

public double volume()
{
	return (4*Math.PI*Math.pow(radius,3));
}

}

class SuperDemo
{
	public static void main(String[] args)
	{
		
		Sphere s = new Sphere(2,3,4,5);
		System.out.println("x coordinate = "+s.getX());
		System.out.println("y coordinate = "+s.getY());
		System.out.println("z coordinate = "+s.getZ());
		System.out.println("Volume of sphere is = "+s.volume());
		
	}
}