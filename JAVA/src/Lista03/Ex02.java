package Lista03;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        int nota =0;
        System.out.println("---------------------------------");
        System.out.println("          RESULTADO              ");
        System.out.println("---------------------------------");
        for(int i = 0; i < 3; i++){
           System.out.println("NOTA: ");
           nota = ler.nextInt();
           nota+= nota;
        }
        double media = nota/3;
        if (media >= 7) {
            System.out.println("APROVADO: " + media);
        } else {
            System.out.println("REPROVADO: " + media);
        }
        
        ler.close();
    }
}