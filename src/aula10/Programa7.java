package aula10;

public class Programa7 {
	public static void analisar() {

		int[] lista = { 12, 21, 34 };
		lista[3] = 9;

	}

	public static void main(String[] args) {
		try {

			analisar();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getClass());
		}
	}

}
