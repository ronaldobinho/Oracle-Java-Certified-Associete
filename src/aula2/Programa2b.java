package aula2;

import java.util.Scanner;

public class Programa2b {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um numero :");
		int num = entrada.nextInt();

		if (num > 0)
			// % = Mod : Resto da divis�o !
			if (num % 2 == 0)
				System.out.println("N�mero Par");
			else
				System.out.println("N�mero Impar");
		else
			System.out.println("Precisa ser um numero positivo");
		
		// Tern�rio         //verifica se � maior que 0, se for realiza a instrucao, caso contr�rio exive um alerta 
		System.out.println((num>0?(num % 2 == 0 ? "N�mero Par" : "N�mero Impar"):"Precisa ser um numero positivo"));

		entrada.close();
	}
}
