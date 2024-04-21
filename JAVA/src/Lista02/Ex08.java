package Lista02;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("VELOCIDADE DE DOWNLOAD");
		System.out.println();
		System.out.println("DIGITE O TAMANHO EM MEGABYTES DO ARQUIVO:");
		double mb = ler.nextDouble();
		
		System.out.println("DIGITE A VELOCIDADE EM Mbps:");
		double mbps = ler.nextDouble();
		
		ler.close();
		
		double minutos = (mb / mbps) / 60;
		
		System.out.printf("TEMPO DE ESPERA: %.0f", minutos);
		System.out.println(" MINUTOS");
	}
}