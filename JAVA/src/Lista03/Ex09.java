package Lista03;

import java.util.Scanner;

public class Ex09 {
 public static void main (String[] args) {
     Scanner ler = new Scanner (System.in);
     
     System.out.println("CLASSE ELEITORAL");
     System.out.println();
     
     System.out.println("DIGITE SUA IDADE:");
     double idade = ler.nextDouble();
     
     ler.close();
     
     if (idade < 16)
      System.out.println("NÃO ELEITOR");
      else if (idade >= 18 && idade <= 65)
       System.out.println("ELEITOR OBRIGATÓRIO");
       else 
        System.out.println("ELEITOR FACULTATIVO");
 }
}