package exercicioRevisao2;

import java.util.Scanner;

/*
 * 7. Modifique o programa anterior para que o sistema imprima uma mensagem de alerta
quando o valor a ser pago ao funcion�rio seja inferior a R$ 50,00: "Aten��o, dirija-se �
dire��o do Hotel!".
 */

public class Ex7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("DIGITE A HORA TRABALHADA: ");
		int tempo = sc.nextInt();
		
		Ex6 info = new Ex6();
		System.out.println("SALARIO: "+info.calcular(tempo));;
		
		if(info.calcular(tempo) < 50) {
			System.out.println("Aten��o, dirija-se � dire��o do Hotel!");
		}
			
	}
		
		
	}


