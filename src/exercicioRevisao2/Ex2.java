package exercicioRevisao2;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("DIGITE DOIS N�MEROS PARA REALIZAR UMA OPERA��O ARITM�TICA:");
		double num1 = sc.nextDouble(), num2 = sc.nextDouble();
		System.out.println("ESCOLHA A OPERA��O ARITM�TICA DENTRE AS OP��ES:");
		System.out.println("+ --> ADI��O");
		System.out.println("- --> SUBTRA��O");
		System.out.println("* --> MULTIPLICA��O");
		System.out.println("/ --> DIVIS�O");
		
		Scanner operation = new Scanner(System.in);
		String op = operation.nextLine();   
		       
		     
		    
		    if(op.equals("+")) {
		    	double resultado = num1 + num2;
		    	System.out.println("Resultado adi��o: "+resultado);	    
		    }
		    
		    if(op.equals("-")) {
		    	double resultado = num1 - num2;
		    	System.out.println("Resultado subtra��o: "+ resultado);
		    }
		    
		    if(op.equals("*")) {
		    	double resultado = num1 * num2;
		    	System.out.println("Resultado multiplica��o: "+ resultado);
		    }
		    
		    if(op.equals("/")) {
		    	double resultado = num1 / num2;
		    	System.out.println("Resultado divis�o: "+ resultado);
		    }
	}
}
