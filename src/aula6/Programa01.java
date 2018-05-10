package aula6;

/*
 * REVISÃO DE ARRAYS
 * Arrays Bidimensionais
 * Métodos
 * Sobrecarga de Metodos - Overloading
 * 
 * 
 */

public class Programa01 {
	public static void main(String[] args) {
		int[] lista = { 2, 3, 4, 5, 6, 7, 8, 9, 97, 5, 33 };

		for (int indice = 0; indice < lista.length - 1; indice++) {
			if(lista[indice]%2==0)
				System.out.print(lista[indice] + " ");
				
			

		}

	}
}
