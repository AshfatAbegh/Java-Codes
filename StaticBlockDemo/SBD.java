import java.lang.*;

public class SBD
{
	private int i1;
	private static int i2;
	
	static
	{
		i2 = 10;
		System.out.println("Static 1");
	}
	
	
	public SBD()
	{
		i1 = 1;
		i2 = 0;
	}
	
	public SBD(int x, int y)
	{
		i1 = x;
		i2 = y;
	}
	
	static
	{
		i2 = 50;
		System.out.println("Static 3");
	}
	public void show()
	{
		System.out.println("i1: "+ i1);
		System.out.println("i2: "+ i2);
	}

	static
	{
		System.out.println("Static 4");
	}
	
	
	public static void main(String args[])
	{
		System.out.println("Inside Main Method");
		
		System.out.println("i2: " + SBD.i2);
		
		SBD sbd1 = new SBD();
		sbd1.show();
		
		SBD sbd2 = new SBD(100, 200);
		sbd2.show();
		
		sbd1.show();
		
		SBD.initialize(11);
		
		sbd1.show();
		sbd2.show();
	}
	
	static
	{
		System.out.println("Static 5");
	}
	
	static 
	{
		System.out.println("Static 2");
	}
	
	public static void initialize(int x)
	{
		i2 = x;
	}
}