package Exercicios;

import java.util.Scanner;

public class calculoSalarioHoras {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Esse Programa Calcula um Sal�rio de um Desenvoledor por Hora \n");
		
		System.out.print("Digite quantas horas voc� trabalho  :");
		int horas = entrada.nextInt();
		
	/*	System.out.println("Digite a porcetagem que voc� recebe de aumento ");
		int aumento = entrada.nextInt();
		*/
		
		double salario;
		if (horas >= 44)
		 salario = (horas * 24) * 4;
		else
			salario = (horas * 20) * 4;
		
		System.out.println("Seu sal�rio � : R$"+ salario);
		
		
	}

}
