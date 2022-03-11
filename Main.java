package basamakSayý;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Sayýyý giriniz: ");
	int number=scan.nextInt();
	int basValue;
	int total=0;
	
	while(number!=0)
	{
		basValue=number%10;
		total+=basValue;
		number/=10;
	}

	System.out.print(total);
	}

}
