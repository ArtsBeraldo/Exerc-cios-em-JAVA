package Lista04;

import java.util.Scanner;

public class Ex01 {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		int soma = 0;
		
		System.out.println("Digite um número:");
		int n = ler.nextInt();
		
		ler.close();
		
		for(int i = 0; i < n; i++) {
			if (i % 2 == 0)
				soma += i;
			else
				System.out.println("Impar: " + i);	
		}
		
		System.out.println("Soma dos números pares = " + soma);	
	}
}