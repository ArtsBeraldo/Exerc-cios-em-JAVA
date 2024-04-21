package Lista03;

import java.util.Scanner;

public class Ex11 {
	public static void main (String [] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println(" DIGITE:\n"
				+ "1 - SALDO\n"
				+ "2 - EXTRATO\n"
				+ "3 - DEPÓSITO\n"
				+ "4 - SAQUE\n"
				+ "5 - SAIR\n");
		int n = ler.nextInt();
		
		ler.close();
		
		switch(n) {
		case 1:
			System.out.println("SALDO TOTAL = VAZIO");
			break;
		case 2:
			System.out.println("EXTRATO- QUE ABSURDO");
			break;
		case 3:
			System.out.println("SE NÃO TEM NADA, COMO VAI EFETUAR O DEPÓSITO");
			break;
		case 4:
			System.out.println("VAI SACAR O QUE ANIMAL");
			break;
		case 5:
			System.out.println("...");
			break;
		default:
			System.out.println("OPÇÃO INVÁLIDA");
		}
	}
}