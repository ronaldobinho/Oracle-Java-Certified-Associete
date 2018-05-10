/*
 * --------TIPOS VÁZIOS-----------
 * TIPOS NUMÉRICOS ---- 0
 * TIPOS BOOLEANS  ---- FALSE
 * TIPOS CHAR >>>> ESPAÇO EM BRANCO 
 * 
 */

package aula8;

public class Carro {
	String marca = "General Motors";
	String modelo = "Luxu";
	int numPortas = 3;
	char cor = 'P';

	/*
	public void mostrarAtributos() {
	System.out.println("Marca :"+marca);
	System.out.println("Modelo :"+modelo);
	System.out.println("Portas : "+ numPortas);
	System.out.println("cor :"+ cor + "\n");
	
	}*/
	
	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", numPortas="
				+ numPortas + ", cor=" + cor + "]";
	}
	
	

}
