package Exercicios;

import java.util.Scanner;

public class temperaturaConverter {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("This Program change to Farenheit to Celsius");

		System.out
				.print("Digite um valor em Farenheit para convertermos em Celsius :");
		int farenheit = entrada.nextInt();

		System.out.println("Convertento "+farenheit+" ºF");

		double Celsius = (farenheit - 32) / 1.8;
		
		System.out.printf("%s%2.0f%s","O Resultado é : ", Celsius, " ºC");
	}

}
