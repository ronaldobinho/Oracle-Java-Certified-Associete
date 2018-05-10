package aula6;

public class Programa04 {
	public static void main(String[] args) {
		int[][] ronaldo = { { 5, 6, 7, 8, 9 }, { 9, 8, 7 }, { 3, 4, 5 }, { 0 },
				{ 1, 2, 3 } };

		for (int[] linha : ronaldo) {
			for (int coluna : linha) {
				System.out.print(" | " + coluna + " | ");

			}

			System.out.println();

		}

	}

}
