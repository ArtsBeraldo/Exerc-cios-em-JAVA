package Lista01;

import java.util.Scanner;

public class Ex14 {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("TROCANDO OS VALORES");
		
		System.out.println("DIGITE O VALOR DE A:");
		int valorB = ler.nextInt();
		
		System.out.println("DIGITE O VALOR DE B:");
		int valorA = ler.nextInt();
		
		ler.close();
		
		System.out.println("VALOR DE A = " + valorA);
		
		System.out.println("VALOR DE B = " + valorB);
		
		// O exercício era só isso.
	}
}