package exercicioRevisao2;

import java.util.Scanner;

/* 
 * 6. O valor pago por um Hotel para seus porteiros � de R$ 12,25 por hora de trabalho. Fa�a um
programa que pergunte ao usu�rio quantas horas ele trabalhou e imprima na tela o valor
do sal�rio a ser recebido por ele.
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


