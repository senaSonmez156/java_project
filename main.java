package perfectNumber;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// 6=1+2+3
		// 28=1+2+4+7+14
		Scanner scan=new Scanner(System.in);
		System.out.print("Sayý giriniz: ");
		int number=scan.nextInt();
		
		int total=0;
		
		for(int i=1; i<number; i++) {
			if(number%i==0) {
				total+=i;
			}
		}
		if(number==total) {
			System.out.print("Sayý mükemmeldir.");
		}
		else {
			System.out.print("Sayý mükemmel deðildir.");
		}
		
	

	}

}
