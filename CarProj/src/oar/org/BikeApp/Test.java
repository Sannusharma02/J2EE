package oar.org.BikeApp;

public class Test 
{
	public static void main(String[] args)
	{
		try
		{
		Class.forName("oar.org.BikeApp.Car");
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
