package oar.org.LightApp;

public class LedLightImpl implements ISwitch{

	@Override
	public void sOn() {
		System.out.println("Ledlight is turned on.");
	}

	@Override
	public void sOff() {
		System.out.println("LedLight is turned off.");
	}
}