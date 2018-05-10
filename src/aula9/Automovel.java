package aula9;

public class Automovel {
	String marca;
	String modelo;
	int cilindradas;
	static{
		//Bloco anônimo estático de inicialização -- Executado apenas 1 vez
		System.out.println("Bloco executado uma vez quando uma instância é executada");
	}
	Automovel() {
		this("Honda");

	}

	Automovel(String marca) {
		this("Yamaha", "Fazer");
	}

	Automovel(String marca, String modelo) {
		this("Kawasaki", "Ninja", 900);

	}

	Automovel(String marca, String modelo, int cilindradas) {
		this.marca = marca;
		this.modelo = modelo;
		this.cilindradas = cilindradas;

	}

}
