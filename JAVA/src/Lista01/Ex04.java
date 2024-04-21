package Lista01;

import java.util.*;

public class Ex04 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("CADASTRO PESSOAL");
		
		System.out.println("NOME COMPLETO:");
		String nome = ler.nextLine();
		
		System.out.println("ENDEREÇO DE RESIDÊNCIA:");
		String endereco = ler.nextLine();
		
		System.out.println("TELEFONE DE CONTATO");
		int telefone = ler.nextInt();
		
		ler.close();
		
		System.out.println("NOME: " + nome);
		System.out.println("ENDEREÇO: " + endereco);
		System.out.println("TELEFONE DE CONTATO: " + telefone);
	}
}