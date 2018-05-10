package aula5;

public class Programa7 {
	public static void main(String[] args) {
/*
		int[] lista = { 5, 1, 2, 3, 4, 6, 7, 8, 9, 0 };

		for (int indice = 0; indice < 10; indice++) {
			System.out.println(lista[indice]);
		}
*/
		double[] conjunto = { 1, 2, 3, 4, 5, 6 };
		for (int indice = 0; indice < conjunto.length; indice++)
			
			if (conjunto[indice]%2==0)
			System.out.print("| Par " + (int) (conjunto[indice]) +"  |");
			else
				System.out.print("| Impar " +(int) (conjunto[indice] )+ " |");

	}

}
