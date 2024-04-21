package Lista03;

import java.util.Scanner;

public class Ex08 {
 public static void main (String[] args) {
     Scanner ler = new Scanner (System.in);
     
     System.out.println("IFORME OS VALORES DE X, Y E Z PARA CONFIRMAR SE PODE FORMAR UM TRÂNGULO");
     
     System.out.println();
     
     System.out.println("DIGITE O VALOR DE X:");
     double x = ler.nextDouble();
     
     System.out.println("DIGITE O VALOR DE Y:");
     double y = ler.nextDouble();
     
     System.out.println("DIGITE O VALOR DE Z:");
     double z = ler.nextDouble();
     
     ler.close();
     
     if (x + y > z && y + z > x && x + z > y)
     System.out.println("COM ESSES VALORES PODE FORMAR UM TRIÂNGULO");
     else 
     System.out.println("NÃO HÁ A POSSIBILIDADE");
 }
}
 