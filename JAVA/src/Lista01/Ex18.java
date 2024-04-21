package Lista01;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("QUANTOS DEGRAUS É NECESSÁRIO SUBIR?");
		System.out.println();
		System.out.println("QUAL ALTURA DESEJADA? obs: Digite em metros");
		double altura = ler.nextDouble();

		System.out.println("QUAL ALTURA DE CADA DEGRAU? obs: Digite em metros");
		double degrau = ler.nextDouble();
		
		ler.close();
		
		double subida = altura / degrau;
		
		System.out.printf("É NECESSÁRIO SUBIR %.2f", subida);
		System.out.print(" DEGRAUS");
	}
} 