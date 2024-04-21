package Lista02;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        System.out.println("ETANOL OU GASOLINA");
        System.out.println("QUAL O VALOR DO ETANOL");
        
        double etanol = ler.nextDouble();
        
        System.out.println("QUAL O VALOR DA GASOLINA");
        
        double gasolina = ler.nextDouble();
        
        ler.close();
        
        if ( etanol < gasolina * 0.7){
            System.out.println("ETANOL EM RELAÇÃO A GASOLINA ESTÁ COMPENSÃO MAIS, ESTANDO 70% MAIS BARATO.");
        }
        else {
            System.out.println("GASOLINA VAI RENDER MAIS QUILOMETRO RODADO POR MENOS MONEY.");
        }
    }     
}