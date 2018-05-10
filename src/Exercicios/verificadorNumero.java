package Exercicios;

import java.util.Scanner;

public class verificadorNumero {
	public static void main(String[] args) {
		
		Scanner entrada= new Scanner (System.in);
		System.out.println("Verificar se um numero é positivo negativo ou zero\n");
		
		System.out.print("Digite um numero inteiro : ");
		int num = entrada.nextInt();
		
		if(num > 0)
			System.out.println("Numero Positivo");
		else if (num < 0 )
			System.out.println("Numero Negativo ");
		else 
			System.out.println("Numero Zero");
		
		
	}

}
