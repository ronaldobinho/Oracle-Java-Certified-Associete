package aula2;

import java.util.Scanner;

public class Programa4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double raio, comprimento, area;

		System.out.println("Essse programa calcula a circunferencia �  :");
		System.out.println("Digite o raio");
		raio = entrada.nextDouble();
		// Math = Matem�tica � uma biblioteca pronta do Java
		comprimento = 2 * Math.PI * raio;

		System.out.println("Valor do comprimento da circunfer�ncia � : " + comprimento);

		area = Math.PI * Math.pow(raio,2);

		System.out.println("Valor do area � :" + area);
		System.out.printf("%s%2.f", "A �rea do Cirulo � :", area);
	}
}
