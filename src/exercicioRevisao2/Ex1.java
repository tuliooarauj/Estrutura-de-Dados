package exercicioRevisao2;

import java.util.Scanner;

public class Ex1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("DIGITE UM NÚMERO PARA CALCULO DE TABUADA: ");
		int num = sc.nextInt();
		int i = 0;
		while(i<=10) {
			int tabuada = num * i;
		System.out.println(num +" x "+i+" = "+tabuada);
		i++;
		}
	}
}
