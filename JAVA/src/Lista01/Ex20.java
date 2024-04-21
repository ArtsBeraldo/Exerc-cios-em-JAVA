package Lista01;

import java.util.Scanner;

public class Ex20 { 
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("CUSTO TOTAL POR PRODUTO");
		System.out.println();
		System.out.println("DIGITE A PORCENTAGEM DO IPI A SER ACRESCIDO NO VALOR DA PEÇA:");
		double ipi = ler.nextDouble();
		
		System.out.println("DIGITE O CÓDIGO DA PEÇA 1:");
		int peca1 = ler.nextInt();
		System.out.println("DIGITE O VALOR UNITÁRIO DA PEÇA 1:");
		double valorPeca1 = ler.nextDouble();
		System.out.println("DIGITE A QUANTIDADE DE PEÇAS 1 FABRICADAS:");
		double quantidade1 = ler.nextDouble();
		
		System.out.println("DIGITE O CÓDIGO DA PEÇA 2:");
		int peca2 = ler.nextInt();
		System.out.println("DIGITE O VALOR UNITÁRIO DA PEÇA 2:");
		double valorPeca2 = ler.nextDouble();
		System.out.println("DIGITE A QUANTIDADE DE PEÇAS 2 FABRICADAS:");
		double quantidade2 = ler.nextDouble();
		
		ler.close();
		
		double peca1Total = (valorPeca1 * ipi / 100 + valorPeca1) * quantidade1;
		double peca2Total = (valorPeca2 * ipi / 100 + valorPeca2) * quantidade2;
		
		System.out.printf("PEÇA " + peca1 + ": CUSTO TOTAL - R$ %.2f%n", peca1Total);
		System.out.printf("PEÇA " + peca2 + ": CUSTO TOTAL - R$ %.2f%n", peca2Total);
	}
}