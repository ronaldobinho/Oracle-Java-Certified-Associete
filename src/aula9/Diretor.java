package aula9;

public class Diretor extends Gerente{

	boolean secretaria = true;

	@Override
	public String toString() {
		return super.toString()+" "+secretaria;
				}

	public double receberSalario(){
		return 4200;
		}
	
	public void tirarFerias() {
		System.out.println("Tirando férias em Orlando");

	}
}
