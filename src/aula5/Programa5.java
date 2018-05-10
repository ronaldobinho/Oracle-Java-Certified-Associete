/*
 * 3&1==0
 * 3%2==1
 * 3%3==0
 * ------
 * 4%1==0
 * 4%2==0
 * 4%3==1
 * 4%4==0
 * ------
 * 5%1==0
 * 5%2==1
 * 5%3==2
 * 5%4==1
 * 5%5==0
 */

package aula5;

import java.util.Scanner;

public class Programa5 {
	public static void main(String[] args) {
		int contPrimo = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("********VERIFICADOR**********");
		System.out.print("Digite um numero : ");
		int n = entrada.nextInt();

		for (int contador = 1; contador <= n; contador++) {
			if (n % contador == 0)
				contPrimo++;

		}

		if (contPrimo == 2)
			System.out.println("É Primo");
		else {
			System.out.println("Não é Primo");
		}
	}
}
