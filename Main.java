package ucgenAlan;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int a,b,c;
		Scanner input=new Scanner(System.in);
		
		System.out.print("1.Kenar� giriniz: " );
		a=input.nextInt();
		
		
		System.out.print("2.Kenar� giriniz: " );
		b=input.nextInt();
		
		System.out.print("3.Kenar� giriniz: " );
		c=input.nextInt();
		
		double cevre=(a+b+c)/2,alan;
		alan=Math.sqrt( cevre * (cevre - a) * (cevre - b) * (cevre - c ) );
		System.out.println("Alan: " + alan);

	}

}
