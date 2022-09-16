package oar.org.LightApp;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the light type");
		String type=scr.next();
		scr.close();
		ISwitch sw=LightFactory.getLight(type);
		if(sw!=null)
		{
			sw.sOn();
			sw.sOff();
		}	
	}
}
