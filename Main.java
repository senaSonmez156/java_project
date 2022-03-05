package cinZodyagý;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int birthYear;
		Scanner input=new Scanner(System.in);
		System.out.print("Doðum yýlýnýzý giriniz: ");
		birthYear=input.nextInt();
		if(birthYear%12==0) {
			System.out.print("Çin zodyaðýna göre burcunuz: Maymun ");
		}
		if(birthYear%12==1) {
			System.out.print("Çin zodyaðýna göre burcunuz: Horoz ");
		}
		if(birthYear%12==2) {
			System.out.print("Çin zodyaðýna göre burcunuz: Köpek");
		}
		if(birthYear%12==3) {
			System.out.print("Çin zodyaðýna göre burcunuz: Domuz");
		}
		if(birthYear%12==4) {
			System.out.print("Çin zodyaðýna göre burcunuz: Fare");
		}
		if(birthYear%12==5) {
			System.out.print("Çin zodyaðýna göre burcunuz: Öküz");
		}
		if(birthYear%12==6) {
			System.out.print("Çin zodyaðýna göre burcunuz: Kaplan");
		}
		if(birthYear%12==7) {
			System.out.print("Çin zodyaðýna göre burcunuz: Tavþan");
		}
		if(birthYear%12==8) {
			System.out.print("Çin zodyaðýna göre burcunuz: Ejderha");
		}
		if(birthYear%12==9) {
			System.out.print("Çin zodyaðýna göre burcunuz: Yýlan");
		}
		if(birthYear%12==10) {
			System.out.print("Çin zodyaðýna göre burcunuz: At");
		}
		if(birthYear%12==11) {
			System.out.print("Çin zodyaðýna göre burcunuz: Koyun");
		}
		
		

	}

}
