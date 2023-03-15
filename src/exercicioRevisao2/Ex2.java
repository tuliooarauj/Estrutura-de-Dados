package exercicioRevisao2;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("DIGITE DOIS NÚMEROS PARA REALIZAR UMA OPERAÇÃO ARITMÉTICA:");
		double num1 = sc.nextDouble(), num2 = sc.nextDouble();
		System.out.println("ESCOLHA A OPERAÇÃO ARITMÉTICA DENTRE AS OPÇÕES:");
		System.out.println("+ --> ADIÇÃO");
		System.out.println("- --> SUBTRAÇÃO");
		System.out.println("* --> MULTIPLICAÇÃO");
		System.out.println("/ --> DIVISÃO");
		
		Scanner operation = new Scanner(System.in);
		String op = operation.nextLine();   
		       
		     
		    
		    if(op.equals("+")) {
		    	double resultado = num1 + num2;
		    	System.out.println("Resultado adição: "+resultado);	    
		    }
		    
		    if(op.equals("-")) {
		    	double resultado = num1 - num2;
		    	System.out.println("Resultado subtração: "+ resultado);
		    }
		    
		    if(op.equals("*")) {
		    	double resultado = num1 * num2;
		    	System.out.println("Resultado multiplicação: "+ resultado);
		    }
		    
		    if(op.equals("/")) {
		    	double resultado = num1 / num2;
		    	System.out.println("Resultado divisão: "+ resultado);
		    }
	}
}
