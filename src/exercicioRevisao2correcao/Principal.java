package exercicioRevisao2correcao;

import java.util.Scanner;

public class Principal {
	
	
	public static void main(String[] args) {
		
			Servico s = new Servico();
			Soma s1 = new Soma();
			Scanner sc = new Scanner(System.in);
			
	//	System.out.println(s.calcularFibonacci());
		
	//	System.out.println(Arrays.toString(s.calcularFiboArray()));
		
	//	System.out.println(s.calcularParImpar());
			
	/*	System.out.print("DIGITE QUALQUER NUMERO NATURAL: ");
		int n = sc.nextInt();
			
		System.out.println(s.ehPrimo(n));
	*/	
		
	/*	
		double venda = sc.nextDouble();
		double custo = sc.nextDouble();
		System.out.println(s.calcularLucro(venda, custo));
	*/		
	
	/*		
		System.out.println("M�todo 1: "+s1.somar(sc.nextInt(), sc.nextInt()));
		
		
		System.out.println("Digite agora o m�todo 2");
		
		System.out.println("M�todo 2: "+s1.somar(sc.nextInt(), sc.nextInt(), sc.nextInt()));
	*/
		
		System.out.println("Digite dois n�meros");			
		System.out.println(s.calcularRestoDivisao(sc.nextInt(),sc.nextInt()));
		
		//Para usar uma var�avel que est� fora do m�todo, basta usar o comando this. 
		
		
		sc.close();	
	}

}
