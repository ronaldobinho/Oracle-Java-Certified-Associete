package aula7;

public class Programa13 {
	
	/*
	 * A LINGUAGEM DA PREFERENCIA AOS TIPOS PRIMITIVOS
	 * SEMPRE O METODO COM A ASSINATURA int a SERÁ EXECUTADO PRIMEIRO
	 * 
	 */
	
public static void metodo1 (Integer b){
		
		System.out.println("(Integer b)");
	}
	
	public static void metodo1 (int a){
		System.out.println("(int a)");
		
	}
	
	
	
	public static void main(String[] args) {
		metodo1(592);
		
	}

}
