package Lista01;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("TRANSFORMADOR DE METROS PARA CENTÍMETROS");
		System.out.println("QUANTOS METROS SERÁ CONVERTIDO?");
		int metro = ler.nextInt();
		
		ler.close();
		
		int centimetro = metro * 100;
		
		System.out.print(metro + " METROS É IGUAL A " + centimetro + " CENTÍMETROS");
	}
}