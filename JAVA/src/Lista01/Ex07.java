package Lista01;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
	  
		Scanner ler = new Scanner(System.in);
    
		System.out.println("VAMOS ANALISAR SEU AUMENTO");
    
		System.out.println("QUANTO VOCÊ RECEBE?");
		double salario = ler.nextDouble();
    
		System.out.println("QUAL VALOR EM % DO SEU AUMENTO?");
		double aumento = ler.nextDouble();
    
		ler.close();
    
		double salarioAumento = salario * aumento / 100;
    
		double novoSalario = salario + salarioAumento;
    
		System.out.println("SALÁRIO ATUAL: R$" + salario);
		System.out.println("AUMENTO: R$" + salarioAumento);
		System.out.println("SALÁRIO ATUALIZADO: R$" + novoSalario);		
    }
}