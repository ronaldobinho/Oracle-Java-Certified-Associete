package aula1;

import java.util.Scanner;

public class Exercicio2 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Multiplicador via Scanner \n");
	
	System.out.print("Digite o primeiro Numero \n");
	int primeiroNumero = entrada.nextInt();
	
	System.out.print("Digite o segundo Numero \n");
	int segundoNumero = entrada.nextInt();
	
	int multiplicacao = primeiroNumero * segundoNumero;
	
	System.out.println("Multiplicacao dos Numeros :"+ multiplicacao);
}
}
