package Lista03;

import java.util.Scanner;

public class Ex05 {
    public static void main (String [] args) {
        Scanner ler = new Scanner (System.in);
        
        System.out.println("------------------------------");
        System.out.println("              IMC             ");
        System.out.println("------------------------------");
        
        System.out.println("Digite sua altura:");
        double altura = ler.nextDouble();
        
        System.out.println("Digite seu peso:");
        double peso = ler.nextDouble();
        
        double imc = peso / (altura*altura);
        
        ler.close();
        
        System.out.println("------------------------------");
        System.out.println("         SUA SITUAÇÃO:        ");
        System.out.println("------------------------------");
        
        System.out.printf("IMC: %.2f", imc);
        if (imc<20)
        System.out.println(" - Abaixo do peso");
        else if (imc<25)
        System.out.println(" - Peso Normal");
        else if (imc<30)
        System.out.println(" - Sobrepeso");
        else if (imc<40)
        System.out.println(" - Obeso");
        else
        System.out.println(" - Obeso Mórbido");
        
    }
}