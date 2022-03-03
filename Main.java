package manav;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlýcan=5.00;
		double armutKg, elmaKg,muzKg,patlýcanKg, domatesKg;
		Scanner input=new Scanner(System.in);
		System.out.print("Hoþgeldiniz :)");
		System.out.print("armut kaç kilo? ");
		armutKg= input.nextDouble();
		System.out.print("Elma kaç kilo? ");
		elmaKg=input.nextDouble();
		System.out.print("Domates kaç kilo? ");
		domatesKg=input.nextDouble();
		System.out.print("Muz kaç kilo? ");
		muzKg=input.nextDouble();
		System.out.print("Patlýcan kaç kilo? ");
		patlýcanKg=input.nextDouble();
		
		
		double toplam= (armut*armutKg)+(elma*elmaKg)+(patlýcan*patlýcanKg)+(domates*domatesKg)+(muz*muzKg);
		System.out.println("Toplam tutarýnýz: "+ toplam);
		
		
		
		
		
		

	}

}
