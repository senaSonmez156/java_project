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
			System.out.print("Giriþ baþarýlý, sisteme yönlendiriliyorsunuz...");
		} else if(!userName.equals(u)&& password.equals(p)) {
			System.out.print("Kullanýcý ismi hatalý!");}
		
			else if (userName.equals(u)&& !password.equals(p)) {
				System.out.print("Þifre hatalý!, Þifrenizi sýfýrlamak ister misiniz? Evet(e)/ Hayýr(h)");}
			String reply=input.nextLine();
			if(reply.equals("h")) {
				System.out.print("Þifre deðiþtirilmedi, Giriþ yap.");
			}
			else if(reply.equals("e")){
			System.out.print("Yeni þifre: ");}
			else {System.out.print("Geçersiz komut");}
			String newPassword=input.nextLine();
			if(newPassword.equals(p)) {
				System.out.print("Giriþ baþarýlý, sisteme yönlendiriliyorsunuz...");
			}
			else {
				System.out.print("Þifre hatalý");
			}
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

		

	}

}
