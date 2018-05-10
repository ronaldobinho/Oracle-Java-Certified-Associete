package aula2;

import java.util.Scanner;

public class Programa2b {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um numero :");
		int num = entrada.nextInt();

		if (num > 0)
			// % = Mod : Resto da divisão !
			if (num % 2 == 0)
				System.out.println("Número Par");
			else
				System.out.println("Número Impar");
		else
			System.out.println("Precisa ser um numero positivo");
		
		// Ternário         //verifica se é maior que 0, se for realiza a instrucao, caso contrário exive um alerta 
		System.out.println((num>0?(num % 2 == 0 ? "Número Par" : "Número Impar"):"Precisa ser um numero positivo"));

		entrada.close();
	}
}
