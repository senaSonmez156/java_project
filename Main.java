package daireAlanHesapla;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int r,merkezAci;
		double pi=3.14;
		
		Scanner inp=new Scanner(System.in);
		System.out.print("Yar��ap�n� giriniz: ");
		r=inp.nextInt();
		System.out.print("Merkez a��y� giriniz: ");
		merkezAci=inp.nextInt();
		
		double alan=(pi * (r*r) * merkezAci) / 360 ;
		System.out.println("Alan: " + alan);
		
		
		//normal alan ve �evre hesaplama
		
		//double normalalan=(pi * r * r);
		//double normalcevre=(2* pi* r) ;
		//System.out.println("normal Alan: " + normalalan);
		//System.out.println("normal �evre: " + normalcevre);

	

	}

}
