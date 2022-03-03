package vucudKitleIndexHesapla;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		double boy,kilo;
		Scanner input=new Scanner(System.in);
		System.out.print("Merhaba, Hoþgeldiniz :) \nBoyunuzu (metre cinsinden)giriniz: ");
		boy=input.nextDouble();
		System.out.print("Lütfen kilonuzu giriniz: ");
		kilo=input.nextDouble();
		
		double index= boy/ (kilo*kilo);
		System.out.println("Vücut kitle index'iniz: " +index);

	}

}
