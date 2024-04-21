package Lista02;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        System.out.println("CALCULADOR DE MINUTOS PASSADOS");
        System.out.println("DIGITE AS HORAS QUE JÁ FORAM PASSADOS: XX:00");
        
        int horas = ler.nextInt();
        
        System.out.println("DIGITE OS MINUTOS QUE JÁ FORAM PASSADOS: 00:XX");
        
        int minutos = ler.nextInt();
        
        ler.close();
        
        int minutosSomados = horas * 60 + minutos;
                
        System.out.println("ATÉ O MOMENTO FORAM PASSADOS " + minutosSomados + " MINUTOS.");
    }
}