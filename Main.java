package dersOrtalamaHesapla;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int matematik,t�rk�e,tarih,co�rafya;
		Scanner val=new Scanner(System.in);
		System.out.println("Matematik:");
		matematik=val.nextInt();
		System.out.println("T�rk�e");
		t�rk�e=val.nextInt();
		System.out.println("Tarih");
		tarih=val.nextInt();
		System.out.println("Co�rafya");
		co�rafya=val.nextInt();
		
		
		int total=matematik+t�rk�e+tarih+co�rafya;
		double sonuc= total/4;
		System.out.println("Ortalaman�z: " + sonuc);
		
		double a=60.0;
		String basariDurumu=(sonuc>a)? "Tebrikler :) S�n�f�n�z� ge�tiniz." : "�zg�n�z :( S�n�f� ge�emediniz.";
		System.out.println(basariDurumu);
		
	}

}
