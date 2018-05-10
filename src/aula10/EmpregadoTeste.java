package aula10;

class Empregado {

	String nome = "Roberto";
	String sobrenome = "Serson";

	Empregado() {
		System.out.println("Nome : " + nome + "\n Sobrenome :" + sobrenome);
	}

}

class Medico extends Empregado {
	int crm = 12345;

	Medico() {
		System.out.println("CRM : " + crm);
	}
}

public class EmpregadoTeste {

	public static void main(String[] args) {
		Medico medico = new Medico();
		System.out.println();
		Empregado empregado = new Medico();

	}

}
