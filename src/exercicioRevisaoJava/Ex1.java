package exercicioRevisaoJava;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		System.out.println("Olá IFBA");
		
		System.out.println("================");
		
		
		
		System.out.print("DIGITE O ANO DE NASCIMENTO: ");
		
		Scanner sc = new Scanner(System.in);
		int anoNascimento = sc.nextInt();
		int idade = 2023 - anoNascimento;
				
		System.out.println("IDADE: "+ idade);
		
		System.out.println("================");
		
		System.out.println("DIGITE TRÊS NOTAS:");
		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		float n3 = sc.nextFloat();
		
		float media = (n1+n2+n3)/3;
		System.out.println("MEDIA: "+media);
		if(media>=7) {
			System.out.println("APROVADO!");
		}
		if(media >= 5 && media < 7) {
			System.out.println("RECUPERAÇÃO");
		}
		if(media < 5) {
			System.out.println("REPROVADO");
		}
		
	}

}
