package aula7;

public class Programa06 {

	public static int calcularFatorial(int numero) {
		int fatorial = 1;

		for (int contador = 1; contador <= numero; contador++) {

			fatorial = contador * fatorial;
		}

		return fatorial;
	}

	public static void main(String[] args) {

		int resultado = calcularFatorial(6);
		System.out.println(2 * resultado);
	}
}
