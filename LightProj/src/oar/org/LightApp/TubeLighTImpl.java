package oar.org.LightApp;

public class TubeLighTImpl implements ISwitch{

	@Override
	public void sOn() {
		System.out.println("Tubelight is turned on.");
	}

	@Override
	public void sOff() {
		System.out.println("Tubelight is turned off.");
	}
}
