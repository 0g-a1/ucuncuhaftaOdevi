package ucuncuDersOdev;

public class UserManager {
	
	
	public void signUp(User user) {
		
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kayýt oldu.");
	}
	
	public void verification(User user) {
		
		
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Kodlama.io ' ya hoþgeldiniz.");
		
	}
	
	public void signOut(User user) {
		
		System.out.println("Çýkýþ Yapýldý.");
	}
	
	public void showUserInfo(User user) {
		
		//
	}
	
	
	
	
	
	
}
