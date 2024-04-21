package Lista01;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("CONVERTER CELSIUS PARA FAHRENHEIT");
        System.out.println("DIGITE UMA QUANTIDADE EM GRAU CELSIUS:");
        double grauCelsius = ler.nextDouble();
        
        ler.close();
        
        double grauFahrenheit = (grauCelsius * 1.8) + 32;
        
        System.out.println("CONVERTENDO FICARIA: " + grauFahrenheit + "ºF");
    }
} 