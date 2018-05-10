/*
 * Fatorial de Um número
 * 
 * 5!=5*4*3*2*1
 * 
 */

package aula5;

public class Programa3 {
	public static void main(String[] args) {
		int contador = 1, fatorial = 1, n = 5;

		while (contador <= 5) {
			fatorial = fatorial * contador;
			System.out.println("Fatorial :"+ fatorial);
			contador++;
		}
	}
}
