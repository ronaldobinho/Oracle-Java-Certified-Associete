package aula2;

import java.util.Scanner;

public class Programa4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double raio, comprimento, area;

		System.out.println("Essse programa calcula a circunferencia é  :");
		System.out.println("Digite o raio");
		raio = entrada.nextDouble();
		// Math = Matemática é uma biblioteca pronta do Java
		comprimento = 2 * Math.PI * raio;

		System.out.println("Valor do comprimento da circunferência é : " + comprimento);

		area = Math.PI * Math.pow(raio,2);

		System.out.println("Valor do area é :" + area);
		System.out.printf("%s%2.f", "A Área do Cirulo é :", area);
	}
}
