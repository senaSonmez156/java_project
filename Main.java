package manav;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patl�can=5.00;
		double armutKg, elmaKg,muzKg,patl�canKg, domatesKg;
		Scanner input=new Scanner(System.in);
		System.out.print("Ho�geldiniz :)");
		System.out.print("armut ka� kilo? ");
		armutKg= input.nextDouble();
		System.out.print("Elma ka� kilo? ");
		elmaKg=input.nextDouble();
		System.out.print("Domates ka� kilo? ");
		domatesKg=input.nextDouble();
		System.out.print("Muz ka� kilo? ");
		muzKg=input.nextDouble();
		System.out.print("Patl�can ka� kilo? ");
		patl�canKg=input.nextDouble();
		
		
		double toplam= (armut*armutKg)+(elma*elmaKg)+(patl�can*patl�canKg)+(domates*domatesKg)+(muz*muzKg);
		System.out.println("Toplam tutar�n�z: "+ toplam);
		
		
		
		
		
		

	}

}
