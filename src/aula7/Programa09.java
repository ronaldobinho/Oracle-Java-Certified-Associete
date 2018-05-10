package aula7;
/*
 * SOBRECARGA DE MÉTODOS  // OVERLOADING
 *
 * METÓDOS COM O MESMO NOME E NA MESMA CLASSE VARIANDO A ASSINATURA = SOBECARGA DE MÉTODOS // OVERLOADING
 * 
 */

public class Programa09 {
	public static int somar(int numero1, int numero2) {

		return numero1 + numero2;
	}

	public static int somar(int n1, int n2, int n3) {

		return n1 + n2 + n3;
	}

	public static int somar(int n1, int n2, int n3, int n4) {

		return n1 + n2 + n3 + n4;
	}

	public static void main(String[] args) {
		System.out.println(somar(10, 20));
		System.out.println(somar(10, 20, 30));
		System.out.println(somar(10, 20, 30, -4));

	}

}
