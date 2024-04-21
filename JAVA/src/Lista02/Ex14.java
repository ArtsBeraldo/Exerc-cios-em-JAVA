package Lista02;

import java.util.Scanner;
import java.lang.Math;

public class Ex14 {
    public static void main(String[] args) {
    	
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe x1: ");
        double x1 = ler.nextDouble();
        
        System.out.print("Informe y1: ");
        double y1 = ler.nextDouble();
        
        System.out.print("Informe x2: ");
        double x2 = ler.nextDouble();
        
        System.out.print("Informe y2: ");
        double y2 = ler.nextDouble();
        
        ler.close();
        
        double distancia = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        
        System.out.printf("A distância entre os pontos P1 e P2 é: %.2f\n", distancia);
  
        
    }
    
}