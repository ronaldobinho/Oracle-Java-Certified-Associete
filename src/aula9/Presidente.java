package aula9;

public class Presidente extends Diretor {
	
	boolean helicoptero = true;

	@Override
	public String toString() {
		return super.toString()+ " " + helicoptero;
	}

	public double receberSalario(){
		return 220000;
		}
	
	public void tirarFerias() {
		System.out.println("Tirando férias em Jundiapeba");

	}
	
	public void reverPlanejamento(){
		System.out.println("Revisão de Metas");
		
	}
}
