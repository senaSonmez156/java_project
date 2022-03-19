package dizibigsmall;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		int arrayDimension, arrayElement;
		Scanner scan=new Scanner(System.in);
		System.out.print("Dizinin boyutunu giriniz: ");
		arrayDimension=scan.nextInt();
		int[] array=new int[arrayDimension];
		
		
		for(int i=0; i<arrayDimension; i++) {
			System.out.println("Dizinin " + (i+1)+ ". elemanýný giriniz:  ");
			arrayElement=scan.nextInt();
			array[i]=arrayElement;
		}

		Arrays.sort(array);
		
		System.out.println("Elemanlarýn küçükten büyüðe sýralanýþý: " + Arrays.toString(array));
		
		
		
		
		
		
		
		
}
}