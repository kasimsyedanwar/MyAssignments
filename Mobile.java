package week2.day1;

public class Mobile {
	
	public void openApplication() {
		System.out.println("Open Chrome to browse internet");
	}
	public void useSearchBar() {
		System.out.println("Search java programs");
	}
	public void onMobile() {
		System.out.println("switch On the mobile");
	}
	public void useCamera() {
		System.out.println("Open Camera to click photos");
	}
	public void sendMessage() {
		System.out.println("Send Message to friends");
	}
	public void watchMovies() {
		System.out.println("watch a tamil movie");
	}
	public void playGames() {
		System.out.println("Play carrom game");
	}
	
	
	
	public static void main(String[] args) {
	Mobile myMobile=new Mobile();
	myMobile.onMobile();
	myMobile.openApplication();
	myMobile.sendMessage();
	myMobile.useSearchBar();
	myMobile.useCamera();
	myMobile.watchMovies();
	myMobile.playGames();
	}
	
	
}
