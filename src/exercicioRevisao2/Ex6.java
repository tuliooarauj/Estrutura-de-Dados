package exercicioRevisao2;

import java.util.Scanner;

/* 
 * 6. O valor pago por um Hotel para seus porteiros é de R$ 12,25 por hora de trabalho. Faça um
programa que pergunte ao usuário quantas horas ele trabalhou e imprima na tela o valor
do salário a ser recebido por ele.
 */

public class Ex6 {
	
	public static double calcular(int tempo) {
		double salario;
		return salario = tempo * 12.25;
	
	}
		
public static void main(String[] args) {
	
	Ex6 result = new Ex6();
	
	Scanner sc = new Scanner(System.in);
	System.out.println("DIGITE A HORA TRABALHADA: ");
	int tempo = sc.nextInt();
		
	
	System.out.println("SALARIO: "+result.calcular(tempo));
	
}
		
	}


