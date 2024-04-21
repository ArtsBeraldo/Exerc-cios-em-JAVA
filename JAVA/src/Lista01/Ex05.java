package Lista01;

import java.util.*;

public class Ex05 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("CONVERSOR DE MOEDAS obs: Real para Dólar");
		System.out.println("QUAL VALOR IRÁ CONVERTER?");
		double real = ler.nextDouble();
		
		System.out.println("QUAL O VALOR DE UM DÓLAR EM REAIS?");
		double dolar = ler.nextDouble();
		
		ler.close();
		
		double conversao = real / dolar;
		
		System.out.printf("VOCÊ POSSUI $%.2f", conversao);
		System.out.print(" DÓLARES");
	}
}