package ucgenAlan;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int a,b,c;
		Scanner input=new Scanner(System.in);
		
		System.out.print("1.Kenarý giriniz: " );
		a=input.nextInt();
		
		
		System.out.print("2.Kenarý giriniz: " );
		b=input.nextInt();
		
		System.out.print("3.Kenarý giriniz: " );
		c=input.nextInt();
		
		double cevre=(a+b+c)/2,alan;
		alan=Math.sqrt( cevre * (cevre - a) * (cevre - b) * (cevre - c ) );
		System.out.println("Alan: " + alan);

	}

}
