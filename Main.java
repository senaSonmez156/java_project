package leapYear;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int year;
		Scanner input=new Scanner(System.in);
		System.out.print("Yılı giriniz: ");
		year=input.nextInt();
		
		
		if(year%4==0) {
			System.out.print(year +" artık bir yıldır.");
		}
		else if(year%400==0) {
			System.out.print(year +" artık bir yıldır.");
		}
		else if(year%400==0 && year%100==0) {
			System.out.print(year +" artık bir yıldır.");
		}
		else if(year%100==0 && year%400!=0) {
			System.out.print(year +" artık bir yıl değildir.");
		}
		else {
			System.out.print(year +" artık bir yıl değildir.");
		}
	

	}

}
