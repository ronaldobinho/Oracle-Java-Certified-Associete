package aula10;

public class Programa8 {

	public static void analisar() {

		int[] lista = new int[] { 12, 14, 14, 55, 33 };

		String nome = "Ronaldo";
		try {

			char letra = nome.charAt(20);

			System.out.println(letra);

		} catch (StringIndexOutOfBoundsException S) {
			// TODO: handle exception
			System.out.println(S.getClass());

		}
	}

	public static void main(String[] args) {
		analisar();
	}

}
