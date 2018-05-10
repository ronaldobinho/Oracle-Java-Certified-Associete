package aula3;

public class Programa01b {
	public static void main(String[] args) {
		int c=10;
		//Operador Unário

		//--c Realiza  a subtracao e imprime o valor
		//c-- Imprime o valor e depois realiza a subtracao
		

		//++c = Realiza a soma e imprime no novo valor
		//c++ = Imprime o valor e realiza a soma
		
		
		/*
		 * ++c  -   c--   +   --c   -   c++  +    --c
		 * 11  11   11   10   9     9    9   10    9
		 */
		
		System.out.println(c);
		System.out.println(++c - c-- + --c - c++ + --c);
		System.out.println(c);
	}
  
}
