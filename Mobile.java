package week1.day1;

public class Mobile {
	String mobileBrandName = "Samsung";
	char logo = 'S';
	short noOfMobilePiece = 2563;
	int modelNumber = 753685958;
	long moblieLmeiNumber = 864527736336870l;
	float mobilePrice = 2500.9724834f;
	boolean isDamaged = false;
	
	public static void main(String[] args) {
		
		Mobile myNewMobile=new Mobile();
		System.out.println(myNewMobile.mobileBrandName);
		System.out.println("logo = "+myNewMobile.logo);
		System.out.println("Mobile Piece Number = "+myNewMobile.noOfMobilePiece);
		System.out.println("Model Number = "+myNewMobile.modelNumber);
		System.out.println("Mobile LMEI Number = "+myNewMobile.moblieLmeiNumber);
		System.out.println("Mobile Price = "+myNewMobile.mobilePrice);
		System.out.println("Is the Mobile Damaged = "+myNewMobile.isDamaged);
		
	}
}
