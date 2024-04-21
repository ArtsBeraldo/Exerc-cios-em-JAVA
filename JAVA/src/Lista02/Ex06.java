package Lista02;

import java.util.Scanner;

public class Ex06 {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		
		// QUESTÃO 06 - INICIO
		System.out.println("LOJA DE CERÂMICA: CÁCULO DE REVESTIMENTO");
		System.out.println("");
		System.out.println("DIGITE A LARGURA DA ÁREA QUE SERÁ REVESTIDA:");
		double largura = ler.nextDouble();
		
		System.out.println("DIGITE O COMPRIMENTO DA ÁREA QUE SERÁ REVESTIDA:");
		double comprimento = ler.nextDouble();
		
		System.out.println("DIGITE A LARGURA DA CERÂMICA:");
		double largura2 = ler.nextDouble();
		
		System.out.println("DIGITE O COMPRIMENTO DA CERÂMICA:");
		double comprimento2 = ler.nextDouble();
		
		double areaRevestimento = largura * comprimento;
		double areaCerâmica = largura2 * comprimento2;
		
		//QEUSTÃO 07 - INICIO
		
		System.out.println("DIGITE O VALOR DO METRO QUADRADO DA CERÂMICA:");
		double valor = ler.nextDouble();
		
		ler.close();
		
		//REPOSTA DA QUESTÃO 06 E 07
		
		double revestimento = areaRevestimento / areaCerâmica + (areaRevestimento / areaCerâmica * 0.10);
		double custoTotal = revestimento * valor;
		
		System.out.printf("QUANTIDAE DE REVESTIMENTO NECESSÁRIO: %.2f%n", revestimento);
		System.out.printf("CUSTO TOTAL: R$ %.2f", custoTotal);
	}
}