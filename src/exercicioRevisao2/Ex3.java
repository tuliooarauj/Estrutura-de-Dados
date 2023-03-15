package exercicioRevisao2;
/*
3. Imprima os primeiros números da série de Fibonacci até passar de 100. A série de
Fibonacci é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc... Para calculá-la, o primeiro elemento
vale 0, o segundo vale 1, daí por diante, o n-ésimo elemento vale o (n-1)-ésimo elemento
somado ao (n-2)-ésimo elemento (ex: 8 = 5 + 3).
 */
public class Ex3 {
	public static void main(String[] args) {
		
			int t1 = 0;
			int t2 = 1;
			System.out.println("SEQUÊNCIA DE FIBONACCI ATÉ PASSAR DE 100");
		System.out.print(t1+", "+t2);
		while(t2<100) {
		
			int t3 = t1 + t2;
			t1=t2;
			t2=t3;
			
			System.out.print(", "+t3);
		}
	}

}
