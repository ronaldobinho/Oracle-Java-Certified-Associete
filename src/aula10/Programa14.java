package aula10;

public class Programa14 {

	public static void analisar() {
		Carro c1 = new Carro();
		c1.abrirPortas();
		c1 = null;
		try {
			c1.abrirPortas();

		} catch (NullPointerException n) {
			System.out.println(n.getClass());

		}
	}

	public static void main(String[] args) {
		analisar();

	}

}
