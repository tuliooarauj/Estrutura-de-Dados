package exercicioRevisao2correcao;

public class Servico {


	public String calcularFibonacci() {
		int resultado = 1;
		int aux = 0;
		
		String fibo = aux + " - " + resultado;
		
		while( resultado < 100) {
			
			resultado = resultado + aux;
			aux = resultado - aux;
			
			fibo += " - " + resultado;
		}
		
		return fibo;
	}
	
	
	public int[] calcularFiboArray() {
		
		int fibo[] = new int[13];
		
		int resultado;
		fibo[0] = 0;
		fibo[1] = 1;
		
		for(int cont=2; cont<fibo.length; cont++) {
			
			resultado = fibo[cont-1]+fibo[cont-2];
			fibo[cont] = resultado;
			
		}
		
		return fibo;
	}
	
	
	
	public String calcularParImpar() {
		
		String resultado;
		int resultadoSoma = 0;
		long resultadoMult = 1;
		
		for(int cont = 1; cont < 30; cont++) {
			
			if(cont%2==0) {
				
				resultadoMult = resultadoMult * cont;
				
			}else {
				
				resultadoSoma = cont + resultadoSoma;
				
			}
		}
		resultado = "A multiplicação dos pares: " + resultadoMult + " - A soma dos ímpares é: "+resultadoSoma;
		return resultado;
	}
	
	
	
	public String ehPrimo(int a) {
		
		String retorno;
		
		boolean teste = true;
		
		if(a%2==0) {
			retorno = "O número é par";			
		}else {
			retorno = "O número é ímpar";
		}
		
		for(int cont = 2; cont < a; cont++) {
			if(a%cont==0) {
				teste = false;
			}
		}
		
		if(teste) {
			retorno += " e primo";
		}
		
		return retorno;
	}
	
	public String calcularLucro(double precoVenda, double precoCusto) {
		
		double resultado;
		String lucroPreju = "";
		
		resultado = precoCusto/precoVenda;
		
		if(resultado >= 50) {
			lucroPreju = "Lucro";
		}else
			lucroPreju = "Prejuizo";
		
		return lucroPreju;
	}
	
	
	public int calcularRestoDivisao(int n1, int n2) {
		int restoDiv;
		
		restoDiv = n1%n2;
		
		return restoDiv;
		
	}
	
	
	
}
