package bigSmall;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 int max = 0,min = 0;
		 System.out.println("kaç adet sayý gireceksiniz: ");
		 int number=scan.nextInt();
	        
	        int [] array = new int[number];
	        
	        for(int i = 0; i < number; i++)
	        {
	            System.out.print("Dizinin " + (i+1) + ". elemanýný giriniz: ");
	            array[i] = scan.nextInt();
	            if(i == 0) {
	                max = array[i];
	                min = array[i];
	            }
	            if(array[i] > max) {
	                max = array[i];
	            }
	            if(array[i] < min) {
	                min = array[i];
	            }
	        }
	        System.out.println("Dizinin en büyük elemaný = " + max);
	        System.out.println("Dizinin en kucuk elemaný = " + min);

	}

}
