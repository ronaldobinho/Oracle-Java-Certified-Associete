package aula5;

public class Programa9 {
	public static void main(String[] args) {

		int lista[] = { 5, 5, 4, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 3, 4, -1, -3,
				-4, -5, -7, -6, 5 - 4 };

		for (int elemento : lista)

			if (elemento % 2 == 0)
				System.out.print(" | " + elemento + "|");

			else if (elemento % 2 == 1)
				System.out.print("| " + elemento + " |");
			else if (elemento > 0)
				System.out.print("|" + elemento + " | ");

	}
}
