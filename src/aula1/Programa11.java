package aula1;

import java.util.Scanner;

public class Programa11 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero1;
		int numero2;
		
		System.out.println("Dentre 2 numero qual é o maior e o menor ?");
		
		System.out.print("Digite o Primeiro Numero");
		numero1 = entrada.nextInt();
		
		System.out.print("Digite o Segundo Numero");
		numero2 = entrada.nextInt();
		
		
		if(numero1 == numero2)
			System.out.printf("%d  == %d \n", numero1, numero2);
		
		if(numero1 != numero2)
			System.out.printf("%d != %d \n", numero1, numero2);
		
		if(numero1 < numero2)
			System.out.printf("%d < %d \n", numero1, numero2);
		
		if(numero1 > numero2)
			System.out.printf("%d > %d \n", numero1, numero2);
		
		if(numero1 <= numero2)
			System.out.printf("%d <= %d \n", numero1, numero2);
		
		if(numero1 >= numero2)
			System.out.printf("%d => %d \n", numero1, numero2);
		
		
	}

}
