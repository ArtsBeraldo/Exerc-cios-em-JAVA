package Lista03;

import java.util.Scanner;

public class Ex10 {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		double venda;
		System.out.println("--------------------------------------------");
		System.out.println("	   Lojinha do Sr. Aboo		");
		System.out.println("--------------------------------------------");
		
		System.out.println("Digite o valor do produto:");
		double valor = ler.nextDouble();
		
		ler.close();
		
		if (valor < 10) {
			venda = valor * 70 / 100 + valor;
			System.out.printf("Valor de venda: R$ %.2f%n", venda);
			System.out.println("Lucro: 70%");
		}
		else if (valor < 30) {
			venda = valor * 50 / 100 + valor;
			System.out.printf("Valor de venda: R$ %.2f%n", venda);
			System.out.println("Lucro: 50%");
		}
		else if (valor < 50) {
			venda = valor * 40 / 100 + valor;
			System.out.printf("Valor de venda: R$ %.2f%n", venda);
			System.out.println("Lucro: 40%");
		}
		else {
			venda = valor * 30 / 100 + valor;
			System.out.printf("Valor de venda: R$ %.2f%n", venda);
			System.out.println("Lucro: 30%");
		}
	}
}