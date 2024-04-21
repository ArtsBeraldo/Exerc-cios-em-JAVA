package Lista04;

import java.util.Scanner;
import java.lang.Math;

public class Ex02 {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Informe um número:");
		int n = ler.nextInt();
		
		ler.close();
		
		for(int i = 0; i < n; i++) {
			if (n <= 0) {
				System.out.println("Número inválido");
			}
			System.out.println("---");
			System.out.println("Número: " + (i+1));
			System.out.println("Quadrado = " + Math.pow(i + 1,  2));
			System.out.println("Cubo = " + Math.pow(i + 1,  3));
			System.out.println("Raiz quadrada = " + Math.sqrt(i + 1));
		}
	}
}
		
