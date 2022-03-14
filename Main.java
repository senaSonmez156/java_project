package tersUcgen;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	    int n;

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayý giriniz: ");
        n = scan.nextInt();

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int x = 1; x <= 2 * (n - i) - 1; x++) {
                System.out.print("*");
            }
            System.out.println();
        }

	}

}
