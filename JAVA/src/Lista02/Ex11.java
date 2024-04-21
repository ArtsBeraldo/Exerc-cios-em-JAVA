package Lista02;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("CONSUMO DE ENERGIA");
		
		// QUESTÕES 11 E 12
		
		System.out.println("DIGITE A POTÊNCIA DO EQUIPAMENTO:");
		double potencia = ler.nextDouble();
		
		System.out.println("DIGITE QUANTAS HORAS O EQUIPAMENTO FICA LIGADO POR DIA:");
		double horas = ler.nextDouble();
		
		System.out.println("DIGITE QUANTAS DIAS NO MÊS O EQUIPAMENTO FICA LIGADO:");
		double mes = ler.nextDouble();
		
		System.out.println("DIGITE O VALOR POR KW/h:");
		double valor = ler.nextDouble();
		
		ler.close();
		
		double consumo = potencia * horas / 1000;
		double valorConsumoDiario = consumo * valor;
		double valorConsumoMes = valorConsumoDiario * mes;
		
		System.out.print("CONSUMO DO EQUIPAMENTO NO DIA: " + consumo);
		System.out.println("KW/h");
		System.out.printf("GASTO DIÁRIO: R$ %.2f%n", valorConsumoDiario);
		System.out.printf("GASTO NO MÊS: R$ %.2f%n", valorConsumoMes);
	}
}