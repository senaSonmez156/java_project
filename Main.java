package userLogin;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		String u="senaSonmez", p="345461";
		Scanner input=new Scanner(System.in);
		System.out.print("User name: ");
		String userName=input.nextLine();
		System.out.print("Password: ");
		String password=input.nextLine();
		
		if(userName.equals(u)&& password.equals(p)) {
			System.out.print("Giri� ba�ar�l�, sisteme y�nlendiriliyorsunuz...");
		} else if(!userName.equals(u)&& password.equals(p)) {
			System.out.print("Kullan�c� ismi hatal�!");}
		
			else if (userName.equals(u)&& !password.equals(p)) {
				System.out.print("�ifre hatal�!, �ifrenizi s�f�rlamak ister misiniz? Evet(e)/ Hay�r(h)");}
			String reply=input.nextLine();
			if(reply.equals("h")) {
				System.out.print("�ifre de�i�tirilmedi, Giri� yap.");
			}
			else if(reply.equals("e")){
			System.out.print("Yeni �ifre: ");}
			else {System.out.print("Ge�ersiz komut");}
			String newPassword=input.nextLine();
			if(newPassword.equals(p)) {
				System.out.print("Giri� ba�ar�l�, sisteme y�nlendiriliyorsunuz...");
			}
			else {
				System.out.print("�ifre hatal�");
			}
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

		

	}

}
