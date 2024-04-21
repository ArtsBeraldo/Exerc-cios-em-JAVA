package Lista03;

import java.util.Scanner;

public class Ex04 {
    public static void main (String [] args) {
        Scanner ler = new Scanner (System.in);
        
        double salario = 0.0;
        double taxaAumento1 = 1.1;
        double taxaAumento2 = 1.2;
        double taxaAumento3 = 1.3;
        
        System.out.println();
        System.out.print("Por favor, informe o valor do salário atual: ");
        salario = ler.nextDouble();
        
        ler.close();
        
        if(salario <= 1000) {
            salario *= taxaAumento3;
        }
        else if(salario <= 2000) {
            salario *= taxaAumento2;
        }
        else if(salario <= 3000) {
            salario *= taxaAumento1;
        }
        else {
            salario = (salario * taxaAumento1) + 200;
        }
        
        System.out.println();
        System.out.printf("Novo salário: R$ %.2f", salario);
        
        // O erro estava no if, o salario passava por todas as opção, dando um resultado errado.
    }
}