package aula7;

public class Programa08 {
	public static boolean verificaPositivo(int numero) {
		boolean resultado;

		if (numero >= 0) {
			resultado = true;
		} else
			resultado = false;
		return resultado;

	}

	public static String retornarString() {
		if (verificaPositivo(10) == true)
			return "Numero é Positivo meu jovem";
		else
			return "Numero é Negativo...";

	}

	public static void main(String[] args) {

		System.out.println(retornarString());
	}
}
