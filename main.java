package perfectNumber;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// 6=1+2+3
		// 28=1+2+4+7+14
		Scanner scan=new Scanner(System.in);
		System.out.print("Say� giriniz: ");
		int number=scan.nextInt();
		
		int total=0;
		
		for(int i=1; i<number; i++) {
			if(number%i==0) {
				total+=i;
			}
		}
		if(number==total) {
			System.out.print("Say� m�kemmeldir.");
		}
		else {
			System.out.print("Say� m�kemmel de�ildir.");
		}
		
	

	}

}
