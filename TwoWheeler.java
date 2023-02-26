package week1.day1;

public class TwoWheeler {
	
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 2457986421135l;
	boolean isPunctured = true;
	String bikeName = "Royal Enfield Classic 350";
	double runningKM = 344567.76;
	
	public static void main(String[] args) {
		
		TwoWheeler myBike= new TwoWheeler();
		
		System.out.println("No of Wheels = "+myBike.noOfWheels);
		System.out.println("No of Mirrors = "+myBike.noOfMirrors);
		System.out.println("Chass is Number = "+myBike.chassisNumber);
		System.out.println("Is Bike Punctured = "+myBike.isPunctured);
		System.out.println("Bike Name = "+myBike.bikeName);
		System.out.println("Running KM = "+myBike.runningKM);
		
	}
}
