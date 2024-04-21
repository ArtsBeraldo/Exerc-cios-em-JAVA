package Lista01;

import java.util.Scanner;
import java.lang.Math;

public class Ex15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    
        System.out.println("BORA FAZER UMA EQUAÇÃO DE SEGUNDO GRAU");
        System.out.println("DIGITE VALOR DE A: ");
        double a = ler.nextDouble();
        System.out.println("DIGITE VALOR DE B: ");
        double b = ler.nextDouble();
        System.out.println("DIGITE VALOR DE C: ");
        double c = ler.nextDouble();
        
        ler.close();
        
        // Calcular o delta
        double delta = Math.pow(b,2)-4*a*c;
        
        // Calcular as raízes
        if (delta > 0){
            double x1 = (-b+Math.sqrt(delta))/2*a;
            double x2 = (-b-Math.sqrt(delta))/2*a;
         
            System.out.println("VALOR DE DELTA:" + delta);
            System.out.println("VALOR DE X1:" + x1);
            System.out.println("VALOR DE X2:" + x2);
        }
        else if (delta <= 0){
        	System.out.println("VAlOR DE DELTA: " + delta);
            System.out.println("NÃO É POSSÍVEL EXTRAIR RAIZ QUADRADA DE UM NÚMERO NEGATIVO NO CONJUNTO DOS NÚMEROS REIAS");
        }
    }
}