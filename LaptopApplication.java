package Laptop;

public class LaptopApplication {
	public void openLaptop() {
		System.out.println("opening the laptop");
	}
	public void closeLaptop() {
		System.out.println("closing the laptop");
	}
	public void typingusingkeyboard() {
		System.out.println("Typing the text using the keyboard");
	}
	public void powerOnButton() {
		System.out.println("Power on button");
	}
	public static void main(String[] args) {
		LaptopApplication myLaptop = new LaptopApplication();
		myLaptop.openLaptop();
		myLaptop.closeLaptop();
		myLaptop.typingusingkeyboard();
		myLaptop.powerOnButton();
	}

}
