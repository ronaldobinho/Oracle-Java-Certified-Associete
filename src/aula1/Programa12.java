package aula1;

import java.util.Scanner;

public class Programa12 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int imparOupar;
		
		System.out.println("Digite um numero, iremos descobrir se ele é impar ou par");
		imparOupar = entrada.nextInt();
		
		if((imparOupar / 2 ) == 0)
				System.out.printf("%s %d %s", "Seu numero", imparOupar, "É Par");
		else
			System.out.printf("%s %s %s", "Seu numero", imparOupar, "É Impar");
	}

}
