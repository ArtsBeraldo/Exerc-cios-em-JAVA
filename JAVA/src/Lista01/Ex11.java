package Lista01;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("MÉDIA DE TRÊS NOTAS");
		System.out.println("DIGITE A PRIMEIRA NOTA:");
		double nota1 = ler.nextDouble();
		
		System.out.println("DIGITE A SEGUNDA NOTA:");
		double nota2 = ler.nextDouble();
		
		System.out.println("DIGITE A TERCEIRA NOTA:");
		double nota3 = ler.nextDouble();
		
		ler.close();
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		System.out.printf("MÉDIA = %.2f", media);
	}
}