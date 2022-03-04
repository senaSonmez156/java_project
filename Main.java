package hesapMakinesi;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int a,b,select;
		
		Scanner input=new Scanner(System.in);
		System.out.print("Input the first number please: ");
		a=input.nextInt();
		System.out.print("Input the second number please: ");
		b=input.nextInt();
		
		System.out.print("please select transaction\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
		select=input.nextInt();
		
		switch(select) {
		case 1:
			System.out.print("Result: " + (a+b));
			break;
		case 2:
			System.out.print("Result: " + (a-b));
			break;
		case 3:
			System.out.print("Result: " + (a*b));
			break;
		case 4:
			if(b!=0) {
			System.out.print("Result: " + (a/b));
			}
			else {
				System.out.print("Upss! Error: divisor cannot be zero");
			}
			break;
			
		default:{
			System.out.print("you entered an invalid number");

		}	
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
			
			
			
		
			
			
			
			
			
			
			
			
			
		

	}

}
