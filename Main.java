package taksimetreHesaplayanUygulama;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		//Taksimetre Program�
		//Java ile gidilen mesafeye (KM) g�re taksimetre tutar�n� ekrana yazd�ran program� yaz�n.

		//Taksimetre KM ba��na 2.20 TL tutmaktad�r.
		//Minimum �denecek tutar 20 TL'dir. 20 TL alt�nda ki �cretlerde yine 20 TL al�nacakt�r.
		//Taksimetre a��l�� �creti 10 TL'dir.  
		
		int km;
		double perkm=2.20, total, startPrice=10;
		
		Scanner input=new Scanner(System.in);
		System.out.print("Gidece�iniz yolu km cinsinden yaz�n�z: ");
		km=input.nextInt();
		total=startPrice+ (perkm*km);
		
		//Totali a�a��daki gibi bir y�ntem ile de yapabilirsniz. Bana mevcut kulland���m code daha pratik geliyor. :)
		//total= (perkm*km);
		//total+=startPrice;
		total=(km<=10)?20:total;
		System.out.print("�cretiniz: " + total);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
