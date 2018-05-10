package Exercicios;

import java.util.Scanner;

public class calculoTriangulo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Este programa calcula a área de um Triangulo \n");
		
		System.out.print("Digite a Altura :\n");
		int altura = entrada.nextInt();
		
		System.out.print("Digite a Base :");
		int base = entrada.nextInt();
         
		System.out.println("Base : "+base +" Altura :"+altura);
		double area = (base * altura) / 2;
		
		System.out.println("A Área desse Triangulo é :" + area);
		
	}

}
