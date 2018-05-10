package aula9;

public class Moto {
	String marca;
	String modelo;
	int cilindradas;

	Moto() {
		this.marca="Honda";
		this.modelo="CB300";
		this.cilindradas=300;
	}
	
	
	Moto(String marca) {
		this.marca=marca;
		this.modelo="CB300";
		this.cilindradas=300;
		
	}

	
	Moto(String marca, String modelo) {
		this.marca=marca;
		this.modelo=modelo;
		this.cilindradas=300;
		
	}
	
	
	Moto(String marca, String modelo, int cilindradas) {
		this.marca=marca;
		this.modelo=modelo;
		this.cilindradas=cilindradas;
		
	}
	@Override
	public String toString() {
		return "Moto [marca=" + marca + ", modelo=" + modelo + ", cilindradas="
				+ cilindradas + "]";
	}

	
}
