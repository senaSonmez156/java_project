package array1;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] array= {15,12, 788,1,-1,-778,2,0};
		System.out.println("Sayýyý giriniz: ");
		int number=scan.nextInt();
		
		int min=number;
		int max=number;
		Arrays.sort(array);

		System.out.println("Dizi: " + Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("Girdiðiniz sayý: " + number);
		
		for(int i:array) {
			if(i<number) {
				min=i;
			}
			if(i>number) {
				max=i;
				break;
			}
		}
		
		
		
		
		
		System.out.println("\nMaksimum deðer:" + max);
		System.out.println("Minimum deðer: " + min);

		

	}

}
