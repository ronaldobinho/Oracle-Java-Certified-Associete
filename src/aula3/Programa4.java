package aula3;

import java.util.Scanner;

public class Programa4 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um inteiro : ");
		int numero = entrada.nextInt();

		if (numero >= 0) {
			switch (numero % 2) {
			case 0:
				System.out.println("Par");
				break;
			case 1:
				System.out.println("Ímpar");
				break;
			}

		} else
			System.out.println("Número negativo, Não pode!!!!!!!!!!!!!!!");

	}

}
