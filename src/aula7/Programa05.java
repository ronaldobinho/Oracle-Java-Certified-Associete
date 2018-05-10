package aula7;

public class Programa05 {
	public static double calcularComprimentoCircunferencia(double raio) {

		return 2 * Math.PI * raio;
	}

	public static void main(String[] args) {

		double resultado = calcularComprimentoCircunferencia(10);
		System.out.print(resultado);
	}

}
