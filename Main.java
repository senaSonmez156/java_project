package avarange;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	double mat,fizik,t�rkce,kimya;
	Scanner input=new Scanner(System.in);
	System.out.print("Matematik notunuz: ");
    mat=input.nextDouble();
    System.out.print("Fizik notunuz: ");
    fizik=input.nextDouble();
    System.out.print("T�rk�e notunuz: ");
    t�rkce=input.nextDouble();
    System.out.print("Kimya notunuz: ");
    kimya=input.nextDouble();
    
    double avarange=(mat+fizik+t�rkce+kimya)/4;
    
    
    if(avarange<=50) {
    	System.out.print("�zg�n�z. S�n�f� ge�emediniz. seneye g�r���r�z. :(");
    }
    else if(avarange>=50 && avarange<=100) {
    	System.out.print("Tebrikler. S�n�f� ge�tiniz. �yi tatiller. :)");
    }
    else {
    	System.out.print("Girdi�iniz bilgilerde hata var. Kontrol ediniz.");
    }
    
    
    
    
    
    

	}

}
