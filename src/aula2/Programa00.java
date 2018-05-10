package aula2;

import java.util.Scanner;

public class Programa00 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Digite o primeiro número : ");
	int num1 = entrada.nextInt();
	
	System.out.print("Digite o Segundo número : ");
	int num2 = entrada.nextInt();
	
	int soma = num1 + num2;
	
	
	System.out.println("O valor da soma é :"+ soma);
}
}
