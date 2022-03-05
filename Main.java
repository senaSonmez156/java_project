package dongulerOdev2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int total=0;
		int n;
		
		do {
			System.out.print("Sayý giriniz: ");
			n=scan.nextInt();
			if(n%2==0 && n%4==0) {
				total += n;
			}
		}
while(n>0);
System.out.print("Toplam: " + total);

	}

}
