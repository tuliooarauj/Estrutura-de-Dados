package exercicioRevisao2;

import java.util.Scanner;

/*
 * Fa�a um programa que receba o n�mero do m�s e mostre o nome do m�s correspondente.
Valide o m�s, ou seja, caso seja digitado um m�s inv�lido informe ao usu�rio.
 */

public class Ex9 {
	
	public int encontrarMes(int mes) {
		 
		
		if(mes < 1 || mes > 12) {
			System.out.println("VALOR INV�LIDO!");
		}
		if(mes == 1) {
			System.out.println("O n�mero "+mes+" corresponde a JANEIRO!");
		}
		if(mes == 2) {
			System.out.println("O n�mero "+mes+" corresponde a FEVEREIRO!");
		}
		if(mes == 3) {
			System.out.println("O n�mero "+mes+" corresponde a MAR�O!");
		}
		if(mes == 4) {
			System.out.println("O n�mero "+mes+" corresponde a ABRIL!");
		}
		if(mes == 5) {
			System.out.println("O n�mero "+mes+" corresponde a MAIO!");
		}
		if(mes == 6) {
			System.out.println("O n�mero "+mes+" corresponde a JUNHO!");
		}
		if(mes == 7) {
			System.out.println("O n�mero "+mes+" corresponde a JULHO!");
		}
		if(mes == 8) {
			System.out.println("O n�mero "+mes+" corresponde a AGOSTO!");
		}
		if(mes == 9) {
			System.out.println("O n�mero "+mes+" corresponde a SETEMBRO!");
		}
		if(mes == 10) {
			System.out.println("O n�mero "+mes+" corresponde a OUTUBRO!");
		}
		if(mes == 11) {
			System.out.println("O n�mero "+mes+" corresponde a NOVEMBRO!");
		}
		if(mes == 12) {
			System.out.println("O n�mero "+mes+" corresponde a DEZEMBRO!");
		}
		return mes;
			
		}
		
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("DIGITE O NUMERO CORRESPONDENTE A UM M�S: ");
		int mesDigitado = sc.nextInt();
		
		Ex9 result = new Ex9();
		
		result.encontrarMes(mesDigitado);
			
		}
		
		
	}


