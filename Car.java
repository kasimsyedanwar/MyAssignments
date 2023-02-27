package week2.day1;

public class Car {
	public void applyBreak() {
		System.out.println("Apply the break for Car");
	}
	public void applyGear() {
		System.out.println("Apply Gear to shift the car speed");
	}
	public void switchOnAc() {
		System.out.println("Switch on Ac inside the car");
	}
	public void applyAcclerate() {
		System.out.println("Apply Acceleration to move the car");
	}
	public void switchOffEngine() {
		System.out.println("Switch off the engine to stop the car");
	}

	public static void main(String[] args) {
		Car myCar=new Car();
		myCar.applyAcclerate();
		myCar.applyBreak();
		myCar.applyGear();
		myCar.switchOffEngine();
	}
}
