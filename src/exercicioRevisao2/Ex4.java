package exercicioRevisao2;
/*
 4. Escreva um programa que imprima na tela a soma dos n�meros �mpares entre 0 e 30 e a
multiplica��o dos n�meros pares entre 0 e 30.
 */

public class Ex4 {
	public static void main(String[] args) {
		int soma = 0;
		long mult = 1;
		System.out.println("\t\t\tNUMEROS �MPARES DE 0 A 30:");
		
		for(int i =1; i < 30; i++ ) {
			if(i%2!=0) {
				System.out.print(i+" ");
							
				soma = soma + i;
				
			}
		}
		
		System.out.print("// SOMA DOS NUMEROS �MPARES: ");
		System.out.println(soma);
		
		
		System.out.println("\n\t\t\tNUMEROS PARES DE 0 A 30:");
		for(int j = 2; j <30; j++) {
			if(j%2==0) {
				System.out.print(j+" ");
				
				mult = mult * j;
			}
		}
		System.out.print("// MULTIPLICA��O DOS NUMEROS PARES: ");
		System.out.println(mult);
		
		
		
		
	}
}
