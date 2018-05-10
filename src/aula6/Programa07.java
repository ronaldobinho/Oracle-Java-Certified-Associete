package aula6;

public class Programa07 {
	public static void main(String[] args) {

		int[][] lista = { { 5, 4, 3, 4 }, { 2, 3, 5, 7, 9, 11 }, { 1 },
				{ 1, 2, 3 } };
		for (int[] linha : lista) {
			for (int coluna : linha) {
				if (coluna % 2 == 1)
					System.out.print(coluna + " | ");

			}
			System.out.println();

		}

	}

}
