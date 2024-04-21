package Lista01;

import java.util.Scanner;

public class Ex13 {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("SEU SALÁRIO LÍQUIDO");
		
		System.out.println("QUANTO RECEBE A HORA?");
		double valorHora = ler.nextDouble();
		
		System.out.println("QUANTAS HORAS TRABALHA NO DIA?");
		int horasDia = ler.nextInt();
		
		System.out.println("QUANTOS DIAS TRABALHA NA SEMANA?");
		int semana = ler.nextInt();
		
		System.out.println("PERCENTUAL DE DESCONTO DO INSS?");
		double inss = ler.nextDouble();
		
		ler.close();
		
		double salario = valorHora * horasDia * semana * 4;
		double salarioLiquido = salario - (valorHora * horasDia * semana * 4 * inss / 100);
		
		System.out.println("SALÁRIO BRUTO: R$" + salario);
		System.out.println("SALÁRIO LÍQUIDO: R$" + salarioLiquido);
	}
}