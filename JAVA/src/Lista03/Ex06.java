package Lista03;

import java.util.Scanner;

public class Ex06 {
    public static void main (String[] args) {
        Scanner ler = new Scanner (System.in);
        
        System.out.println("----------------------------------------");
        System.out.println("             ESTAÇÃO DO ANO             ");
        System.out.println("----------------------------------------");
        
        System.out.println("Digite um número de 1 a 4: ");
        System.out.println("1 - Primavera\n" +
                           "2 - Verão\n" +
                           "3 - Outono\n" +
                           "4 - Inverno");
        int estacao = ler.nextInt();
        ler.close();
        switch(estacao) {
            case 1:
                System.out.println("Primavera: A estação das flores.");
                break;
            case 2:
                System.out.println("Verão: Tempo de praia e sol.");
                break;
            case 3:
                System.out.println("Outono: Folhas caem, formando um tapete no chão.");
                break;
            case 4:
                System.out.println("Inverno: A estação mais fria, ideal para um bom chocolate quente.");
                break;
            default:
                System.out.println("Número inválido");
        }
    }
    
}