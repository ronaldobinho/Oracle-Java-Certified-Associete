package aula2;

import java.util.Scanner;

public class Programa6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        
		// &  Avalia as duas condições
		//&& Avalia a primeira condição apenas
		// | avalia as 2 condições
		// || avalia a primeira condição
		
		System.out.print("Digite a Frequencia do aluno :");
		double frequencia = entrada.nextDouble();

		System.out.print("Digite a Média :");
		double media = entrada.nextDouble();

		if (frequencia >= 0.75)
			if (media >= 7)
				System.out.println("Parabéns Aprovado !!");
			else if (media >= 5)
				System.out.println("Exame !!");
			else
				System.out.println("Reprovado");
		else
			System.out.println("Reprovado");
	}

}
