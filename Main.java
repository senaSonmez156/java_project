package taksimetreHesaplayanUygulama;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		//Taksimetre Programý
		//Java ile gidilen mesafeye (KM) göre taksimetre tutarýný ekrana yazdýran programý yazýn.

		//Taksimetre KM baþýna 2.20 TL tutmaktadýr.
		//Minimum ödenecek tutar 20 TL'dir. 20 TL altýnda ki ücretlerde yine 20 TL alýnacaktýr.
		//Taksimetre açýlýþ ücreti 10 TL'dir.  
		
		int km;
		double perkm=2.20, total, startPrice=10;
		
		Scanner input=new Scanner(System.in);
		System.out.print("Gideceðiniz yolu km cinsinden yazýnýz: ");
		km=input.nextInt();
		total=startPrice+ (perkm*km);
		
		//Totali aþaðýdaki gibi bir yöntem ile de yapabilirsniz. Bana mevcut kullandýðým code daha pratik geliyor. :)
		//total= (perkm*km);
		//total+=startPrice;
		total=(km<=10)?20:total;
		System.out.print("Ücretiniz: " + total);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
