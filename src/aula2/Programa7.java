package aula2;

import java.util.Scanner;

public class Programa7 {
	public static void main(String[] args) {
		// 0-90, 90-180, 180-270, 270-360
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um ângulo : ");
		double angulo = entrada.nextDouble();
		
		if(angulo >= 0 && angulo <= 90)
		System.out.println("Primeiro Quadrante");
		
		else if(angulo > 90 && angulo <= 180)
		System.out.println("Segundo Quadrante");
		
		else if(angulo > 180 && angulo <= 270)
			System.out.println("Terceiro Quadrante");
		
		else if(angulo > 270 && angulo <= 360)
			System.out.println("Quarto Quadrante");
	   entrada.close();
	}
}
