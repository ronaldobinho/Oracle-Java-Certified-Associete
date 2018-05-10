package aula8;

import java.util.Scanner;

public class Programa1 {
	public static int somar() {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o primeiro número : ");
		int num1=entrada.nextInt();
		
		System.out.print("Digite o segundo número : ");
		int num2=entrada.nextInt();
		
		return num1 + num2;

	}

	public static void main(String[] args) {
		int resultado = somar();
		
		System.out.println(resultado);

	}

}
