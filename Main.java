package dersOrtalamaHesapla;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int matematik,türkçe,tarih,coðrafya;
		Scanner val=new Scanner(System.in);
		System.out.println("Matematik:");
		matematik=val.nextInt();
		System.out.println("Türkçe");
		türkçe=val.nextInt();
		System.out.println("Tarih");
		tarih=val.nextInt();
		System.out.println("Coðrafya");
		coðrafya=val.nextInt();
		
		
		int total=matematik+türkçe+tarih+coðrafya;
		double sonuc= total/4;
		System.out.println("Ortalamanýz: " + sonuc);
		
		double a=60.0;
		String basariDurumu=(sonuc>a)? "Tebrikler :) Sýnýfýnýzý geçtiniz." : "Üzgünüz :( Sýnýfý geçemediniz.";
		System.out.println(basariDurumu);
		
	}

}
