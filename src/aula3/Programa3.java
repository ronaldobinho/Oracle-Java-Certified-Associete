package aula3;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Programa3 {
	public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Digite um numero inteiro de 1 a 3 : ");
    int numero =entrada.nextInt();
    
    switch (numero) {
	case 1:
		System.out.println("Você Digitou 1");
		
		break;
	case 2:
		System.out.println("Você digitou 2");
		
		break;
		
	case 3:
		
		System.out.println("VocÊ digitou 3");
		
		break;
	
	default:
		
	System.out.println("Numero fora da faixa");
		break;
	}
    

	
	}
	
	

}
