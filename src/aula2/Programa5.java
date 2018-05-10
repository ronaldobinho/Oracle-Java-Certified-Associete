package aula2;

import java.util.Scanner;

public class Programa5 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String num;
		System.out.println("Digite o num");
		num = entrada.next();

		System.out.println(Math.random());
		System.out.println(6 * Math.random());
		System.out.println((int) 6 * Math.random());
		System.out.println(1 + (int) (6 * Math.random()));
		// deslocamento ex=1 número multiplicador ex=6
		System.out.println(num + (int) (6 * Math.random()));

	}
}
