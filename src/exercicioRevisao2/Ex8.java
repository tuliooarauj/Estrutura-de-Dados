package exercicioRevisao2;

import java.util.Scanner;

/*
 * 8. Fa�a um programa que receba o pre�o de custo e o pre�o de venda de um produto, e
mostre como resultado se houve lucro ou preju�zo, para ser considerado lucro o pre�o do
produto deve ser no m�nimo 50% mais caro do que o pre�o de custo.
 */

public class Ex8 {
	
	public static double produto(double custo, double venda) {
		double lucro = 1;
		double prejuizo = 0;
		if(venda > (1.5 * custo)) {
			return lucro;
		}else
			return prejuizo;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("DIGITE O VALOR DO CUSTO: ");
		double custo = sc.nextDouble();
		System.out.print("DIGITE O VALOR DA VENDA: ");
		double venda = sc.nextDouble();
		System.out.println("\nVALOR 50% A MAIS DO CUSTO: "+(1.5*custo));
		Ex8 result = new Ex8();
		if(result.produto(custo, venda) == 1) {
			System.out.println("\n\tLUCRO");
		}else
			System.out.println("\n\tPREJUIZO");
	
	}
	
	
	
	
	
	

}
