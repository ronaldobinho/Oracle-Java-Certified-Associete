package aula3;

import java.util.Scanner;

public class Programa00 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um ângulo entre e 360: ");
		double angulo = entrada.nextDouble();

		if (angulo > 270 && angulo < 360)
			System.out.println("Quarto quadrante");
		else if (angulo > 180) {
			System.out.println("Segundo Quadrante");
			System.out.println("Você esta no caminho certo");
		}
		else if(angulo > 90)
			System.out.println("Terceiro Quadrante");
		else
			System.out.println("Quarto Quadrante");
	
	}

}
