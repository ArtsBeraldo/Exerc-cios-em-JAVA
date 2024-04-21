package Lista03;

import java.util.Scanner;

public class Ex03{
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        int votoNulo = 0, votoBranco = 0, votoValido = 0;
        char tipo;
        int quantidade = 0;
        System.out.println("---------------------------------");
        System.out.println("              VOTOS            ");
        System.out.println("---------------------------------");
        
        for(int i = 0; i < 3; i++){
            System.out.println("DIGTE A QUANTIDADE:");
            quantidade = ler.nextInt();
            System.out.println("DIGITE 'B' PARA BRANCOS, 'N' PARA NULOS E 'V' PARA VÁLIDOS");
            tipo = ler.next().charAt(0);
            switch(tipo){
                case'B':
                    votoBranco += quantidade;
                    break;
                case'N':
                    votoNulo += quantidade;
                    break;
                case'V':
                    votoValido += quantidade;
                    break;
                default:
                System.out.println("ERRO");
            }
        }
        
        ler.close();
        
        int total = votoValido + votoNulo + votoBranco;
        System.out.println("TOTAL: " + total);
        System.out.println("VOTOS EM BRANCO: " + votoBranco * 100 / total + " %");
        System.out.println("VOTOS EM NULOS: " + votoNulo * 100 / total + " %");
        System.out.println("VOTOS EM VÁLIDOS: " + votoValido * 100 / total + " %");
    }
}