package aula2;

import java.util.Scanner;

public class Programa2 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int num1, num2;
		
		System.out.print("Digite o primeiro número : ");
		num1 = entrada.nextInt();
		
		System.out.print("Digite o segundo número :");
		num2 = entrada.nextInt();
		
		if (num1 >= num2 )
			System.out.println("Maior/Igual");
		else
			System.out.println("Menor");
		
		String resultado ="";
		
	    //Operador ternário 
		resultado = (num1 >= num2)? "Maior/Igual" : "Menor";
           
		System.out.println("O resultdo é  : "+ resultado);
	}

}
