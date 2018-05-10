package aula6;

import java.util.Scanner;

public class Programa6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("-------- QUAL O COMPRIMENTO DO ARRAY?-------------");
		int comprimento = entrada.nextInt();

		int[] lista = new int[comprimento];

		for (int indice = 0; indice < lista.length; indice++) {
			System.out.print("Digite o valor do elemento" + lista[indice]
					+ " : ");
			lista[indice] = entrada.nextInt();
		}
		for (int elemento : lista)
			System.out.print(elemento + " ");

	}

}
