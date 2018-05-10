package aula6;

import java.util.Scanner;

public class Programa09 {
	public static void calculaComprimentoCircunferencia() {
		System.out.println("Método Comprimento :");
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o valor do RAIO : ");
		int raio = entrada.nextInt();
		System.out.printf("%.2f", 2 * Math.PI * raio);
		System.out.println();
	}

	public static void calculaAreaDoCirculo() {
		System.out.println("Método Área :");
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o calculo da Area do Circulo : ");
		int raio = entrada.nextInt();
		System.out.printf("%.2f",Math.PI * Math.pow(raio, 2));
		System.out.println();

	}

	public static void main(String[] args) {
		calculaComprimentoCircunferencia();
		calculaAreaDoCirculo();
	}
}
