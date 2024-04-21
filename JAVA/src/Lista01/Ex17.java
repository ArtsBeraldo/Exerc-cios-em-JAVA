package Lista01;

import java.util.Scanner;

public class Ex17 {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Compraram-se N canetas iguais, que foram pagas com uma nota de Z reais, obtendo-se Y reais como troco. Quanto custou cada caneta? ");
		System.out.println();
		
		System.out.println("ESCOLHA QUANTAS CANETAS FORAM COMPRADAS:");
		int canetas = ler.nextInt();
		
		System.out.println("ESCOLHAO VALOR DA NOTA ENTREGUE NO CAIXA:");
		double valorPago = ler.nextDouble();
		
		System.out.println("QUANTO DE TROCO FOI DEVOLVIDO:");
		double troco = ler.nextDouble();
		
		ler.close();
		
		double resposta = (valorPago - troco) / canetas;
		
		System.out.println("Compraram-se " + canetas + " canetas iguais, que foram pagas com uma nota de " + valorPago + " reais, obtendo-se " + troco + " reais como troco. Quanto custou cada caneta? ");
		System.out.println();
		System.out.printf("RESPOSTA: %.2f", resposta);
		System.out.print(" REAIS");
	}
}