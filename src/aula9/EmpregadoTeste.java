package aula9;

/*
 * 
 * POLIMORFISMO
 * 
 * 
 * SOBRECARGA - MÉTODOS DE UMA MESMA CLASSE COM O MESMO NOME VARIANDO APENAS A ASSINATURA
 * 
 * 
 * SOBREPOSIÇÃO - MÉTODOS COM O MESMO NOME, COM DIFERENTES TIPOS DE RETORNO PERTENCENTES A OUTRAS CLASSES.
 * 
 */

public class EmpregadoTeste {

	public static void main(String[] args) {
		Empregado e = new Empregado();
		Empregado g = new Gerente();
		Empregado d = new Diretor();
		Empregado p = new Presidente();

		System.out.println(e.toString());
		System.out.println(g.toString());
		System.out.println(d.toString());
		System.out.println(p.toString());

		Empregado[] lista = { e, e, e, g, e, e, d, g, g, p, e, e, e,
				new Presidente() };
		double total = 0;

		
		  for(Empregado x:lista)
			  //Verifica se x é uma instancia de gerente
			  
			  if (x instanceof Gerente)
					((Gerente) x).tirarFerias();

		  
		  
		 

		// Casting, Retornando a instancia p para Presidente, podendo assim usar
		// o método reverPlanejamento
		((Presidente) p).reverPlanejamento();

		if (g instanceof Gerente)

			((Gerente) g).contratar();

	}
}
