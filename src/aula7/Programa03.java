package aula7;

public class Programa03 {

	public static void calcularAreaCirculo(int raio) {
 
		System.out.print( Math.PI * raio * raio);
		System.out.println(Math.PI*Math.pow(raio, 2));
	}

	public static void main(String[] args) {
		calcularAreaCirculo(20);
	}
}
