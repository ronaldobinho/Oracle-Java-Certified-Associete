package aula10;

public class Carro {

	String marca = "GM";
	String modelo = "Vectra";
	int numPortas = 5;

	Carro() {
		super(); //Invocação implicita 
		System.out.println(" Marca \n " +marca + " \n Modelo " + modelo + " \n numPortas"
				+ numPortas);
	}

	public void abrirPortas() {

		System.out.println("Abrindo Portas !");
	}
}
