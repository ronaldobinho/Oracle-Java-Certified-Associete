/*
 * ENCAPSULAMENTO - É O MECANISCO A PARTIR DO QUAL ESCONDEMOS DOS USUÁRIOS DETALHES DE IMPLELEMTAÇÃO DE CLASSE
 * 
 * 
 * 
 * 
 */

package aula8;

import java.util.Scanner;

public class Conta {
	String numero;
	Double saldo = 0.0;
	String limite;
	Scanner entrada = new Scanner(System.in);

	public void menu() {
		int escolha;

		System.out.println("1 - SACAR");
		System.out.println("2 - CONSULTAR SALDO");
		System.out.println("3 - DEPOSITAR");
		System.out.println("4 - FINALIZAR SESSÃO");
		escolha = entrada.nextInt();

		do {
			if (escolha != 4) {

				switch (escolha) {
				case 1:
					sacar();
					break;
				case 2:
					consultarSaldo();
					break;
				case 3:
					depositar();
					
				default:
					System.out.println("OPÇÃO INVALIDA");
					
				}
			}

		} while (escolha != 4);

	}

	public Double consultarSaldo() {
    System.out.println(saldo);
	return saldo;	
	}

	public void sacar() {
		System.out.println("Digite o valor a sacar");
		int valor = entrada.nextInt();
		saldo = saldo - valor;
		System.out.println(consultarSaldo());
		System.out.println("SAQUE REALIZADO COM SUCESSO");
	}

	public void depositar() {
		System.out.println("Digite o valor a Depositar");
		int valor = entrada.nextInt();
		saldo = saldo + valor;
		System.out.println(consultarSaldo());
		System.out.println("DEPOSITO REALIZADO COM SUCESSO");

	}
	
	public void finalizarSessao(){
		
		System.out.println("SAINDO DO BANCO");
		
		
	}

}
