package aula1;

import java.util.Scanner;

public class Programa13 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	int numero;
	int maior = 0;
	int menor = 0;
	
	
	for (int i = 0; i <5;  i++ ){
		System.out.println("Digite o" +(i+1) + "Numero");
		numero = entrada.nextInt();
		//Verifica se o numero � maior
		if (numero > maior) {
			maior = numero;
			
		}
		//Verifica se o numero � menor
		if (numero < menor) {
			menor = numero;
			
		} 
	}
	
		System.out.println("O maior numero � " + maior);
		System.out.println("O menor numero � "+ menor);
	
}
}
