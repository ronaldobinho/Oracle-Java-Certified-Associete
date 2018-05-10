package aula10;

//EXCEPTIONS
public class Programa6 {
	public static void analisar() {
		try {
			int x = 10 / 0;
		} catch (ArithmeticException qualquercoisa) {
			System.out.println(qualquercoisa.getMessage() +
					qualquercoisa.getClass()+
					"\n"+qualquercoisa.getCause());

		}
	}

	public static void main(String[] args) {
		analisar();

	}

}
