package Lista03;

import java.util.Scanner;

public class Ex07 {
    public static void main (String [] args){
        Scanner ler = new Scanner (System.in);
        
        double totalPg;
        
        System.out.print("Digite o nome do produto: ");
        String produto = ler.nextLine();
        
        System.out.println();
        
        System.out.print("Digite a quantidade do produto: ");
        int quantidade = ler.nextInt();
        
        System.out.println();
        
        System.out.print("Digite o preço da unidade: ");
        double preco = ler.nextDouble();
        
        ler.close();
        
        System.out.println();
        
        double total = quantidade * preco;
        
        if (quantidade <= 5){
            totalPg = total - total * 0.02;
        }
        else if (quantidade <=10){
            totalPg = total - total * 0.03;
        }
        else if (quantidade <=30){
            totalPg = total - total * 0.05;
        }
        else{
            totalPg = total - total * 0.1;
        }
        
        System.out.println("Qnt - " + quantidade + " " + produto + ", custo total = R$" + totalPg);
    }
}