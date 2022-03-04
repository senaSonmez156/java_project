package avarange;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	double mat,fizik,türkce,kimya;
	Scanner input=new Scanner(System.in);
	System.out.print("Matematik notunuz: ");
    mat=input.nextDouble();
    System.out.print("Fizik notunuz: ");
    fizik=input.nextDouble();
    System.out.print("Türkçe notunuz: ");
    türkce=input.nextDouble();
    System.out.print("Kimya notunuz: ");
    kimya=input.nextDouble();
    
    double avarange=(mat+fizik+türkce+kimya)/4;
    
    
    if(avarange<=50) {
    	System.out.print("Üzgünüz. Sýnýfý geçemediniz. seneye görüþürüz. :(");
    }
    else if(avarange>=50 && avarange<=100) {
    	System.out.print("Tebrikler. Sýnýfý geçtiniz. Ýyi tatiller. :)");
    }
    else {
    	System.out.print("Girdiðiniz bilgilerde hata var. Kontrol ediniz.");
    }
    
    
    
    
    
    

	}

}
