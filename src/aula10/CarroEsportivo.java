package aula10;

public class CarroEsportivo extends Carro {
	boolean aerofolio = true;
	boolean conversivel = false;

	public CarroEsportivo() {
		super();// Invocação implícita !!! 
		// TODO Auto-generated constructor stub
		System.out.println("Aerofolio :" +aerofolio+ "\n" + "Conversivel :" + conversivel);
	}

}
