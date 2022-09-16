package oar.org.LightApp;

public class LightFactory 
{
	public static ISwitch getLight(String type)
	{
		if (type.equalsIgnoreCase("tubelight"))
		{
			return new TubeLighTImpl();
		}
		if (type.equalsIgnoreCase("ledlight"))
		{
			return new LedLightImpl();
		}
		else 
		{
			System.err.println("NO Light Found...");
		}
		return null;
	}
}
