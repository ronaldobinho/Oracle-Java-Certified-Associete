package aula2;

public class Programa2a {
	public static void main(String[] args) {
		int num = 10;
		
		if (num > 0)
			System.out.println("Positivo");
		else 
			System.out.println("Negativo");
	   
		//Operador Tern�rio
		System.out.println((num > 0)?"Positivo":"Negativo");
	}

}
