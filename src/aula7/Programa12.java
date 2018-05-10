package aula7;

public class Programa12 {
	public static double calcularMedia(double... notas) {
		double media = 0, total = 0;

		for (double elemento : notas)
			total += elemento;

		media = total / notas.length;
		return media;

	}

	public static void main(String[] args) {
		System.out.println(calcularMedia(10, 4, 5, 6, 7, 4, 3, 4, 5, 6, 8, 7,
				5, 3, 3, 4, 4, 5, 6, 10, 0));
		System.out.println(calcularMedia(10, 5, 20));
	}
}
