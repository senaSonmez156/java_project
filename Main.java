package leapYear;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int year;
		Scanner input=new Scanner(System.in);
		System.out.print("Y�l� giriniz: ");
		year=input.nextInt();
		
		
		if(year%4==0) {
			System.out.print(year +" art�k bir y�ld�r.");
		}
		else if(year%400==0) {
			System.out.print(year +" art�k bir y�ld�r.");
		}
		else if(year%400==0 && year%100==0) {
			System.out.print(year +" art�k bir y�ld�r.");
		}
		else if(year%100==0 && year%400!=0) {
			System.out.print(year +" art�k bir y�l de�ildir.");
		}
		else {
			System.out.print(year +" art�k bir y�l de�ildir.");
		}
	

	}

}
