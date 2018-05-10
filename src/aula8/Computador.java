package aula8;

import java.util.Scanner;

public class Computador {
	String marca;
	String modelo;
	String processador;
	String cor;
	String fonte;
	String memoria;
	String hardDisk;

	public String toString() {
		return "Marca : " + marca + "\n" + "Modelo : " + modelo + "\n"
				+ "Processador : " + processador + "\n" + "Cor : " + cor + "\n"
				+ "Fonte : " + fonte + "\n" + "Memoria : " + memoria + "\n"
				+ "HD : " + hardDisk + "\n";
	}

	public void cadastrarComputador() {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Marca : ");
		marca = entrada.next();
		System.out.println("Modelo : ");
		modelo = entrada.next();
		System.out.println("Processador : ");
		processador = entrada.next();
		System.out.println("Cor : ");
		cor = entrada.next();
		System.out.println("Fonte : ");
		fonte = entrada.next();
		System.out.println("Memória : ");
		memoria = entrada.next();
		System.out.println("HD : ");
		hardDisk = entrada.next();

	}

}
