package exercicioRevisao2;
/*
3. Imprima os primeiros n�meros da s�rie de Fibonacci at� passar de 100. A s�rie de
Fibonacci � a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc... Para calcul�-la, o primeiro elemento
vale 0, o segundo vale 1, da� por diante, o n-�simo elemento vale o (n-1)-�simo elemento
somado ao (n-2)-�simo elemento (ex: 8 = 5 + 3).
 */
public class Ex3 {
	public static void main(String[] args) {
		
			int t1 = 0;
			int t2 = 1;
			System.out.println("SEQU�NCIA DE FIBONACCI AT� PASSAR DE 100");
		System.out.print(t1+", "+t2);
		while(t2<100) {
		
			int t3 = t1 + t2;
			t1=t2;
			t2=t3;
			
			System.out.print(", "+t3);
		}
	}

}
