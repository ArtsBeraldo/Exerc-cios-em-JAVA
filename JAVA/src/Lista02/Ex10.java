package Lista02;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
	
		System.out.println("CONSUMO IDEAL DE ÁGUA");
		System.out.println();
		System.out.println("DIGITE O SEU PESO (KG):");
		double peso = ler.nextDouble();
		
		ler.close();
		
		double agua = peso * 0.035;
		
		System.out.printf("CONSUMO IDEAL: %.2f", agua);
		System.out.println(" LITROS DE ÁGUA");
	}
}