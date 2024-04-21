package Lista03;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        
        System.out.println("---------------------------------");
        System.out.println("            DIVISÃO              ");
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("DIGITE PRIMEIRO NÚMERO:");
        double n1 = ler.nextDouble();
        System.out.println("DIGITE SEGUNDO NÚMERO:");
        double n2 = ler.nextDouble();
        if (n2 == 0){
            System.out.println("RESULTADO INVÁLIDO");
        }
        else {
            System.out.println("RESULTADO: " + n1 / n2);
        }
        
        ler.close();
    }
}