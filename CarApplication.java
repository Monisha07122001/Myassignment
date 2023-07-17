package car;

public class CarApplication {
	public void applyBreak() {
		System.out.println("applied Break");
	}
	public void applyGear() {
		System.out.println("applied Gear");
	}
	public void switchOnAc() {
		System.out.println("switched On Ac");
	}
	public void applyAccelerate() {
		System.out.println("apply the Accelerate");
	}
	public static void main(String[] args) {
		CarApplication mycarApplication = new CarApplication();
		mycarApplication.applyBreak();
		mycarApplication.applyGear();
		mycarApplication.switchOnAc();
		mycarApplication.applyAccelerate();
	}

}
