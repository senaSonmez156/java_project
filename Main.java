package faktoriyel;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int r,n;
		Scanner scan=new Scanner(System.in);
		System.out.print("c(n,r)kombinasyonu için: ");
		System.out.print("n sayýsýný giriniz: " );
		n=scan.nextInt();
		System.out.print("r sayýsýný giriniz: " );
		r=scan.nextInt();
		
		int totaln=1, totalr=1, totalneksir=1;
		
		for(int i=1; i<=n; i++) {
			totaln=totaln*i;
			
		}
		System.out.print("n!:" + totaln);
		
		
		for(int j=1; j<=r; j++ ) {
			totalr=totalr*j;
		}
		System.out.print("r!:" + totalr);
		
		  System.out.println("r!= "+totalr);
	        for(int k=1;k<=(n-r);k++){
	            totalneksir=totalneksir*k;
	        }
	        System.out.println("(n-r)!= "+totalneksir);
	        double sonuc=totaln/(totalr*(totalneksir));
	        System.out.println(sonuc);

		
		
		
		
		
		
		
		
		
		
		

	}

}
