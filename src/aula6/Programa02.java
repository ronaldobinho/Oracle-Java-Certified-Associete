package aula6;

public class Programa02 {
	public static void main(String[] args) {
		int[] lista = { 3, 4, 5, 2, 3, 5, 3, 2, 4, 5, 6, 7, 8 };

		// FOR-INT
		for (int ronaldo : lista)
			if (ronaldo % 2 == 0)
				System.out.print(ronaldo + " ");

	}

}
