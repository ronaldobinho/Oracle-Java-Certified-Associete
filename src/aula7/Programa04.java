package aula7;
/*
 * CALCULAR FATORIAL
 *  DO WHILE
 * 
 */
public class Programa04 {

	public static void calcularFatorial(int numero) {

		int contador = 1, fatorial = 1;
		do {
			fatorial = contador * fatorial;
			contador++;

		} while (contador <= numero);
		System.out.println(2*fatorial);
	}

	public static void main(String[] args) {
		calcularFatorial(7);
	}

}
