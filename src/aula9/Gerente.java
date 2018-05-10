package aula9;

public class Gerente extends Empregado {

	String departamento = "Marketing";

	@Override
	public String toString() {
		return super.toString() + " " + departamento;

	}

	public double receberSalario() {
		return 2200;
	}
	
	public void tirarFerias() {
		System.out.println("Tirando férias em Campinas");

	}
	
	public void contratar(){
		System.out.println("Contratando empregado");
		
	}
}
