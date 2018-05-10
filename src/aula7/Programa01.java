package aula7;

import java.util.Scanner;

/*
 *  
 * 
 */

public class Programa01 {

	public static void calcularComprimentoCircunferencia() {
		Scanner entrada = new Scanner(System.in);

		System.out.printf("%s", "Digite um numero :");
		int raio = entrada.nextInt();
		
		System.out.println(2*Math.PI*raio);

	}
	
	public static void main(String[] args) {
		calcularComprimentoCircunferencia();
	}

}
