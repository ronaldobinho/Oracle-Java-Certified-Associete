package aula7;

public class Programa14 {

	/*
	 * A LINGUAGEM DA PREFERENCIA AOS TIPOS PRIMITIVOS SEMPRE O METODO COM A
	 * ASSINATURA int a SERÁ EXECUTADO PRIMEIRO
	 * 
	 * A LINGUAGEM IRA EXECUTAR O METODO COM INTEGER PELO FATO DE TER EXATAMENTO OS 2 PARAMETROS DA CHAMADO DE MÉTODO
	 */

	public static void metodo1(Integer a, Integer b) {

		System.out.println("(Integer a, Integer b)");
	}


	public static void metodo1(Integer...lista){
		
		System.out.println("Integer...lista");
		
	}
	
	public static void main(String[] args) {
		metodo1(43, 592,-67);

	}

}
