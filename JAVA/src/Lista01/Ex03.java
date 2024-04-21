package Lista01;

import java.util.*;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("QUAL O SEU NOME?");
		String nome = ler.nextLine();
		
		ler.close();
		
		System.out.println("Olá " + nome);
	}
}