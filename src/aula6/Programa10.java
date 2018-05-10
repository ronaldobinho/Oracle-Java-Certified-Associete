package aula6;

import java.util.Scanner;

public class Programa10 {

	public static void caclularNumerosPrimos() {
		System.out.println("Caclular Primos");
		Scanner entrada = new Scanner(System.in);

		int numeros = 0;
		for (int indice = 0; indice < numeros; indice++)
			System.out.println("Digite um numero");

	}

	public static void calculaFatorial() {
		System.out.println("Calcula Fatorial :");
		Scanner entrada = new Scanner(System.in);
		int fator = 1;
		
		System.out.println("Digite um numero ");
		int n = entrada.nextInt();
		
		

		for (int indice = 1; indice < n; indice++) {
			System.out.print(fator +" ");
			fator = fator * indice;
			
		}

	}

	public static void main(String[] args) {
		calculaFatorial();
	}

}
