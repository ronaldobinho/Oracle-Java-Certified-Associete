package aula10;

public class Programa13 {
	public static void analisar() {
	try {

		int x = 10 / 0;	
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		System.out.println("Erro");
	};
	}

	public static void resolver() {
		analisar();
	}

	public static void fazer() {
		resolver();
	}

	public static void solucionar() {
		fazer();

	}

	public static void main(String[] args) {
		solucionar();

	}
}
