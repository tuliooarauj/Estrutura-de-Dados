package exercicioRevisaoJava;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("INFORME A DIST�NCIA PERCORRIDA EM KM:");
		int distancia = sc.nextInt();
		
		System.out.print("INFORME O TEMPO GASTO EM HORAS:");
		int tempo = sc.nextInt();
		
		float vMedia = distancia/tempo;
		
		System.out.println("Velocidade M�dia: "+vMedia+"km/h");
		
	}

}
