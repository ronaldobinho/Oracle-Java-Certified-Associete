package aula4;

public class Programa30 {
	public static void main(String[] args) {
		int[] lista = { -1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5, 4, 3, 2 };

		System.out.println(lista.length);

		for (int contador = 0; contador < lista.length; contador++)
			System.out.print(lista[contador] + " ");

	}
}
