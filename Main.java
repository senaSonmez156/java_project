package cinZodyag�;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int birthYear;
		Scanner input=new Scanner(System.in);
		System.out.print("Do�um y�l�n�z� giriniz: ");
		birthYear=input.nextInt();
		if(birthYear%12==0) {
			System.out.print("�in zodya��na g�re burcunuz: Maymun ");
		}
		if(birthYear%12==1) {
			System.out.print("�in zodya��na g�re burcunuz: Horoz ");
		}
		if(birthYear%12==2) {
			System.out.print("�in zodya��na g�re burcunuz: K�pek");
		}
		if(birthYear%12==3) {
			System.out.print("�in zodya��na g�re burcunuz: Domuz");
		}
		if(birthYear%12==4) {
			System.out.print("�in zodya��na g�re burcunuz: Fare");
		}
		if(birthYear%12==5) {
			System.out.print("�in zodya��na g�re burcunuz: �k�z");
		}
		if(birthYear%12==6) {
			System.out.print("�in zodya��na g�re burcunuz: Kaplan");
		}
		if(birthYear%12==7) {
			System.out.print("�in zodya��na g�re burcunuz: Tav�an");
		}
		if(birthYear%12==8) {
			System.out.print("�in zodya��na g�re burcunuz: Ejderha");
		}
		if(birthYear%12==9) {
			System.out.print("�in zodya��na g�re burcunuz: Y�lan");
		}
		if(birthYear%12==10) {
			System.out.print("�in zodya��na g�re burcunuz: At");
		}
		if(birthYear%12==11) {
			System.out.print("�in zodya��na g�re burcunuz: Koyun");
		}
		
		

	}

}
