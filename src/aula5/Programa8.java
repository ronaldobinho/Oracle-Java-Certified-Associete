package aula5;

public class Programa8 {
	public static void main(String[] args) {
		double[] conjunto = { 1, 2, 3, 4, 5, 6 };
		
		for(int indice=0;indice<conjunto.length;indice++)
			
			switch ((int) (conjunto[indice]%2)) {
			case 1:
				System.out.println(" | "+ (int) (conjunto[indice])+ " |");
				
			}
 
		
	}
}
