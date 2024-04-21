package Lista02;

import java.util.Scanner;
import java.lang.Math;

public class Ex03 {
	public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        System.out.println("PITÁGORAS");
        System.out.println("DIGITE O VALOR DO PRIMEIRO CATETO:");
        double cateto01 = ler.nextDouble();
        
        System.out.println("DIGITE O VALOR DO SEGUNDO CATETO:");
        double cateto02 = ler.nextDouble();
        
        ler.close();
        
        double hipotenusa = Math.sqrt(Math.pow(cateto01, 2) + Math.pow(cateto02, 2));
        
        System.out.println("O VALOR DA HIPOTENUSA É:" + hipotenusa);
    }    
}
   