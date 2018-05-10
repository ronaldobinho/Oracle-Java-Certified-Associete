//0=1 2 3 4
//1=5 6
//2=0
//3=7,8,9,10

package aula6;

public class Programa03 {
	public static void main(String[] args) {
		int[][] lista = { { 1, 2, 3, 4 }, { 5, 6 }, { 0 }, { 7, 8, 9, 10 } }; // array
																				// bidimensional

//		System.out.println(lista[3][1]);

		for (int[] linha : lista) {
			for (int coluna : linha)
				System.out.print("|" + coluna + "|");
			System.out.println();
		}
	}
}
