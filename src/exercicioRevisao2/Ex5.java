package exercicioRevisao2;

import java.util.Scanner;

/*
5. Fa�a um programa para ler um n�mero do teclado e imprimir na tela se ele � par ou �mpar.
Imprima tamb�m se ele � primo.
 */

public class Ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("DIGITE QUALQUER N�MERO NATURAL: ");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("O n�mero '"+num+"' escolhido � par!");
		}else {
			System.out.println("O n�mero '"+num+"' escolhido � �mpar!");
		}
		
	
			if(ehPrimo(num)) 
				System.out.println("� primo");
			else 
				System.out.println("N�o � primo");
		
			
			
		}
	
	public static boolean ehPrimo(int num) {
		for(int i = 2; i < num; i++) {
			if(num % i == 0) 
				return false;	
		}
	return true;
	}	
}


