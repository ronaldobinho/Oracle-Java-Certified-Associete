package aula9;

public class GraduadoTeste {
	public static void main(String[] args) {

		Graduado g = new Graduado();
		Graduado e = new Especialista();
		Graduado m = new Mestre();
		Graduado d = new Doutor();

		Graduado[] lista = { g, e, m, d };

		for (Graduado x : lista) {
			x.ministrarAula();
			
			if(x instanceof Mestre)                     //Casting - Forcar a classe mestre a usar o método   
			System.out.println("Menbros na Banca :"+	((Mestre) x).informarQuantidadeMenbrosBanca());
		}
		}

	}

