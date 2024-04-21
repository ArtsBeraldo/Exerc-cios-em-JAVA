package Lista01;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("DIGITE DOIS NÚMEROS QUE SERÃO SOMADOS");
		System.out.print("DIGITE O PRIMEIRO NÚMERO:");
		double primeiro = ler.nextDouble();
		
		System.out.print("DIGITE O SEGUNDO NÚMERO:");
		double segundo = ler.nextDouble();
		
		ler.close();
		
		double soma = primeiro + segundo;
		
		System.out.println("RESULTADO DA SOMA: " + soma);
	}
}
