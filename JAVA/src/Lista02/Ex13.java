package Lista02;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o numerador da primeira fração: ");
        int numerador1 = ler.nextInt();

        System.out.println("Informe o denominador da primeira fração: ");
        int denominador1 = ler.nextInt();

        System.out.println("Informe o numerador da segunda fração: ");
        int numerador2 = ler.nextInt();

        System.out.println("Informe o denominador da segunda fração: ");
        int denominador2 = ler.nextInt();
        
        ler.close();

        int denominadorComum = denominador1 * denominador2;
        int numeradorResultado = numerador1 * denominador2 + numerador2 * denominador1;

        System.out.printf("Resultado da soma: %d/%d\n", numeradorResultado, denominadorComum);

    }
    
}