package exercicioRevisao2;

import java.util.Scanner;

/*
 * Faça um programa que receba o número do mês e mostre o nome do mês correspondente.
Valide o mês, ou seja, caso seja digitado um mês inválido informe ao usuário.
 */

public class Ex9 {
	
	public int encontrarMes(int mes) {
		 
		
		if(mes < 1 || mes > 12) {
			System.out.println("VALOR INVÁLIDO!");
		}
		if(mes == 1) {
			System.out.println("O número "+mes+" corresponde a JANEIRO!");
		}
		if(mes == 2) {
			System.out.println("O número "+mes+" corresponde a FEVEREIRO!");
		}
		if(mes == 3) {
			System.out.println("O número "+mes+" corresponde a MARÇO!");
		}
		if(mes == 4) {
			System.out.println("O número "+mes+" corresponde a ABRIL!");
		}
		if(mes == 5) {
			System.out.println("O número "+mes+" corresponde a MAIO!");
		}
		if(mes == 6) {
			System.out.println("O número "+mes+" corresponde a JUNHO!");
		}
		if(mes == 7) {
			System.out.println("O número "+mes+" corresponde a JULHO!");
		}
		if(mes == 8) {
			System.out.println("O número "+mes+" corresponde a AGOSTO!");
		}
		if(mes == 9) {
			System.out.println("O número "+mes+" corresponde a SETEMBRO!");
		}
		if(mes == 10) {
			System.out.println("O número "+mes+" corresponde a OUTUBRO!");
		}
		if(mes == 11) {
			System.out.println("O número "+mes+" corresponde a NOVEMBRO!");
		}
		if(mes == 12) {
			System.out.println("O número "+mes+" corresponde a DEZEMBRO!");
		}
		return mes;
			
		}
		
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("DIGITE O NUMERO CORRESPONDENTE A UM MÊS: ");
		int mesDigitado = sc.nextInt();
		
		Ex9 result = new Ex9();
		
		result.encontrarMes(mesDigitado);
			
		}
		
		
	}


