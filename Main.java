package dongulerKuvvet;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int k;
		Scanner scan=new Scanner(System.in);
		System.out.print("�st s�n�r say�s� giriniz: ");
		k=scan.nextInt();
		for(int i=1; i<=k; i*=4) {
			System.out.println("(4'�n kuvvetleri)");
			System.out.println(i+ ",");
			
		}
		for(int i=1; i<=k; i*=5) {
			System.out.println("(5'in kuvvetleri)");
			System.out.print(i+",");
			
		}
		

	}

}
