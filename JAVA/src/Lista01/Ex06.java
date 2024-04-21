package Lista01;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("QUAL A SUA IDADE?");
		int idade = ler.nextInt();
		
		ler.close();
		
		int diasVividos = idade * 365;
		
		System.out.print("SABIA QUE VOCÊ APROXIMADAMENTE VIVEU " + diasVividos);
	}
}