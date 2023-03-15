package exercicioRevisaoJava;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor do produto: ");
		float valorProduto = sc.nextFloat();
		
		float valorPrestacao = valorProduto/5;
		System.out.println(valorPrestacao);
		
		
	}

}
