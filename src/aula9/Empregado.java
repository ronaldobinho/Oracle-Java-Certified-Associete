package aula9;

public class Empregado {
	String nome;
	String sobrenome;
	int cadastro;
	String cargo;
	double salario;

	@Override
	public String toString() {
		return "Empregado [nome=" + nome + ", sobrenome=" + sobrenome
				+ ", cadastro=" + cadastro + ", cargo=" + cargo + ", salario="
				+ salario + "]";
	}

	public double receberSalario() {
		return 1200;

	}

	public void tirarFerias() {
		System.out.println("Tirando férias em Guararema");

	}
	
	
}
