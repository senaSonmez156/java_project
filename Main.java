package etkinlikOnerme;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	int heat;
	Scanner input =new Scanner(System.in);
	System.out.print("Bir hava sýcaklýðý giriniz: ");
	heat=input.nextInt();
	
	if(heat<5) {
		System.out.print("Hava da epey soðukmuþ. Kayak yapabilirsiniz. :)");
	}
	else if(heat<=25) {
		if(heat<=15) {
			System.out.print("Duyduðuma göre vizyonda yeni filmler gelmiþ. Sinemaya gitmeye ne dersin? ");
		}
		
		if(heat>=10) {
			System.out.print("Bence lezzetli atýþtýrmalýklarýný hazýrla ve hemen pikniðe git! :)");
		}
		else {
			System.out.print("Ne bekliyorsun? Hadi yüzmeye gidelim");
		}
	}

	}

}
