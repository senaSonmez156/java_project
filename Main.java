package metotlarUsluSayilar;
import java.util.Scanner;
public class Main {
	static int power(int x,int y) {
		int result=1;
		for(int i=1; i<=y; i++)
		{
			result *=x;
		}
		return result;
	}

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Sayýyý giriniz: ");
	int a=scan.nextInt();
	System.out.print("Üssü giriniz: ");
	int b=scan.nextInt();
	
	System.out.println(power(a,b));

	}

}
