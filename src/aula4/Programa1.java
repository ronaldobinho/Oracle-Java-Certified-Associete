package aula4;

public class Programa1 {
	public static void main(String[] args) {
		int n=5;
		for (int contador=1, fatorial=1; contador<=n; contador++){
			System.out.println("valor do contador :" +contador);
			fatorial=fatorial*contador;
			System.out.println(fatorial + "");
			
		}
	}

}
