package Lista02;

import java.util.Scanner;
import java.lang.Math;

public class Ex05 {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("RETÂNGULO");
		System.out.println();
		
		System.out.println("DIGITE A BASE DO RETÂNGULO:");
		double base = ler.nextDouble();
		
		System.out.println("DIGITE ALTURA DO RETÂNGULO");
		double altura = ler.nextDouble();
		
		ler.close();
		
		double area = base * altura;
		double perimetro = 2 * (base + altura);
		double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
		
		System.out.println("AREA DO RETÂNGULO: " + area);
		System.out.println("PERÍMETRO DO RETÂNGULO: " + perimetro);
		System.out.println("DIAGONAL DO RETÃNGULO: " + diagonal);
	}
}
