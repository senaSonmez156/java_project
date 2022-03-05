package dongulerOrnek1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Sayýyý giriniz: ");
		int sayi=input.nextInt();
		
		int toplam=0;
		int n=0;
				
		for(int i=0; i<sayi; i++) {
			
			if((i%3==0) && (i%4==0)) {
				System.out.println("Bölünen sayýlar: " + i);
				toplam=toplam+n;
				n++;
				
			}
		}
		
		System.out.print("Toplam: " + toplam + "\nAdet: " +n);
		int ortalama=toplam/n;

		System.out.print("\nOrtalama: " + ortalama);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
