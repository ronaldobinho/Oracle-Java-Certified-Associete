package aula2;

import java.util.Scanner;

public class Programa3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		//Tipos Primitivos - Calcular a idade em Milesegudnos
		System.out.println("Este Programa Calcula a idade em MileSegundos");
		
		System.out.print("Digite a sua idade : ");
		int idade = entrada.nextInt();
        
		 //Multiplicando 1L no começo eu transformo o resultado em uma variavel do tipo long
		//2 OPÇÕES 1L NO COMECO DA OPERACAO OU TROCAR 365 POR 365L
		
		System.out.println(1L *idade* 365 * 24 * 60 * 60 * 1000 +" Milesegundos"); // resultado na maioria das vezes
	    	                                                       // maior que bits
	}
}
