package aula7;

/*
 *  VAR-ARGS
 *  VARIABLE - ARGUMENT
 *  VARIAVEL DE ARGUMENTOS
 *  = PERMITE A SOBRECARGA / OVERLOADING NA ASSINATURA DO MÉTODO QUANDO HÁ VARIAÇÃO NA ASSINATURA DO MÉOTODO, POR QUANTIDADE
 *  VARIÁVEL DE ARGUMENTOS. É SEMPRE O ÚLTIMO ARGUMENTO
 */

public class Programa10 {
	public static void somar(int... lista)// Lista automáticamente vira um array
											// sem tamanho definido
	{
		int total = 0;
        //FOR Otimizado
		for (int elemento : lista) {
			total += elemento; // Percore a lista elemento e soma o valor a variavel total
		}
		System.out.println(total);
	}

	public static void main(String[] args) {

		somar(10, 102, 03, 405, 505, 0, 30, 405, 03, 03, 30, 3, 0, 2, 2, 2, 2,
				2, 05, 5, 5);
		somar(10);
		somar();
		somar(10, 30, 40);
	}

}
