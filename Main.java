package usluSayilar;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int k,u;
		System.out.print("Say�y� girniz: ");
		 k=scan.nextInt();
		System.out.print("�s� yaz�n�z: ");
		 u=scan.nextInt();
		 int total=1;
		 
		 for(int i=1; i <= u ; i++) { 
			 total*=k;
		 }
		
		 System.out.print("Cevap: " + total);

	}

}
