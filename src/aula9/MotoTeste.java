package aula9;
/*
 * 
 * CONSTRUTOR - � UM M�TODO ESPECIAL QUE POSSUI O MESMO NOME DA CLASSE
 * E N�O TEM TIPO DE RETORNO. NAO RETORNA NADA NEM VOID !
 * 
 * 
 * 
 * CONSTRUTOR PADR�O - � DISPONIBILIZDO POR DE DEFAULT, QUANDO NENHUM OUTRO CONSTRUTOR � DEFINIDO.
 * O MESMO N�O POSSUI ARGUMENTOS !
 */

public class MotoTeste {
	public static void main(String[] args) {
		Moto moto1 = new Moto();
		System.out.println(moto1);

		Moto moto2 = new Moto("Yamaha");
		System.out.println(moto2);
		
		Moto moto3 = new Moto("HONDA", "CB500");
		System.out.println(moto3);
		
		Moto moto4 = new Moto("Kawasaki", "Ninja", 7000);
		System.out.println(moto4);
		
		
		
		
		
		
		

	}

}
