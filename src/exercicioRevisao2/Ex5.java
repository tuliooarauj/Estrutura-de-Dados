package exercicioRevisao2;

import java.util.Scanner;

/*
5. Faça um programa para ler um número do teclado e imprimir na tela se ele é par ou ímpar.
Imprima também se ele é primo.
 */

public class Ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("DIGITE QUALQUER NÚMERO NATURAL: ");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("O número '"+num+"' escolhido é par!");
		}else {
			System.out.println("O número '"+num+"' escolhido é ímpar!");
		}
		
	
			if(ehPrimo(num)) 
				System.out.println("É primo");
			else 
				System.out.println("Não é primo");
		
			
			
		}
	
	public static boolean ehPrimo(int num) {
		for(int i = 2; i < num; i++) {
			if(num % i == 0) 
				return false;	
		}
	return true;
	}	
}


