package vucudKitleIndexHesapla;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		double boy,kilo;
		Scanner input=new Scanner(System.in);
		System.out.print("Merhaba, Ho�geldiniz :) \nBoyunuzu (metre cinsinden)giriniz: ");
		boy=input.nextDouble();
		System.out.print("L�tfen kilonuzu giriniz: ");
		kilo=input.nextDouble();
		
		double index= boy/ (kilo*kilo);
		System.out.println("V�cut kitle index'iniz: " +index);

	}

}
