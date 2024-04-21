package Lista01;

import java.util.Scanner;

public class Ex16 {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("VAMOS VER SUA MÉDIA DE GASTOS DE COMBUSTÍVEL DA VIAJEM");
		
		System.out.println("KM VIAJADOS:");
		double km = ler.nextDouble();
		
		System.out.println("COMBUSTÍVEL CONSUMIDO:");
		double combustivel = ler.nextDouble();
		
		ler.close();
		
		double media = km / combustivel;
		
		System.out.printf("A MÉDIA DE GASTO É DE %.2f", media);
		System.out.println(" POR KILÔMETRO RODADO.");
	}
}