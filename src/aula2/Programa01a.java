package aula2;

import java.util.Scanner;

public class Programa01a {
public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
	
	System.out.print("Digite um numero   :");
	int num = entrada.nextInt();
	
	if(num > 0)
		System.out.println("Número Positivo");
	else if(num < 0)
		System.out.println("Número Negativo");
	else if (num == 0)
		System.out.println("Número igual a 0");
	
	entrada.close();
}
}
