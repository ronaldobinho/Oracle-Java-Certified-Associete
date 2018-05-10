package aula10;

public class Programa10 {

	public static void analisar() {

		int[] lista = new int[] { 12, 14, 14, 55, 33 };
		try {

			for (int contador = 0; contador <= lista.length; contador++) {
				System.out.println(lista[contador]);

			}
			String nome = "Ronaldo";

			char letra = nome.charAt(20);

			System.out.println(letra);

		} catch (StringIndexOutOfBoundsException S) {
			// TODO: handle exception
			System.out.println("Erro StringIndexOutOfBoundsException Tratado");

		} catch (ArrayIndexOutOfBoundsException a) {

			System.out.println("Erro ArrayIndexOutOfBoundsException Tratado");

		}
	}

	public static void main(String[] args) {
		analisar();
	}

}
