package Lista02;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
	
		System.out.println("IMC");
		
		System.out.println("DIGITE SEU PESO ATUAL:");
		double pesoAtual = ler.nextDouble();
		
		System.out.println("DIGITE SUA ALTURA EM CENTÍMETROS:");
		double altura = ler.nextDouble();
		
		ler.close();
		
		double pesoIdealM = 52 + (0.75 * (altura - 152.4));
		double pesoIdealF = 52 + (0.67 * (altura - 152.4));
		
		double pesoAjustadoM = ((pesoAtual - pesoIdealM) * 0.25) + pesoIdealM;
		double pesoAjustadoF = ((pesoAtual - pesoIdealF) * 0.25) + pesoIdealF;
		
		System.out.printf("PESO IDEAL (SEXO FEMININO): %.2f%n", pesoIdealF);
		System.out.printf("PESO IDEAL AJUSTADO (SEXO FEMININO): %.2f%n", pesoAjustadoF);
		System.out.printf("PESO IDEAL (SEXO MASCULINO): %.2f%n", pesoIdealM);
		System.out.printf("PESO IDEAL AJUSTADO (SEXO MASCULINO): %.2f", pesoAjustadoM);
	}
}