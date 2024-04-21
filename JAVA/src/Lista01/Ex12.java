package Lista01;

import java.util.Scanner;

public class Ex12 { 
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("ANTECESSOR E SUCESSOR");
		System.out.println("DIGITE UM VALOR NUMÉRICO:");
		int valor = ler.nextInt();
		
		ler.close();
		
		int antecessor = valor - 1;
		int sucessor = valor + 1;
		
		System.out.println("SEU ANTECESSOR É " + antecessor);
		System.out.println("SEU SUCESSOR É " + sucessor);
	}
}