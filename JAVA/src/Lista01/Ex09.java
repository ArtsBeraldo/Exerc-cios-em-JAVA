package Lista01;

import java.util.Scanner;
import java.lang.Math;

public class Ex09 {
    
    public static void main (String[] args){
        
        Scanner ler = new Scanner ( System.in);
        
        System.out.println("DIGITE O RAIO DA ESFERA:");
        
        double raio = ler.nextDouble();
        
        ler.close();
        
        System.out.println("COMPRIMENTO DA ESFERA: " + 2 * Math.PI * raio);
        System.out.println("ÁREA DA ESFERA: " + Math.PI * Math.pow(raio, 2));
        System.out.println("VOLUME DA ESFERA: " + 0.25 * Math.PI * Math.pow(raio, 3));
    }
}