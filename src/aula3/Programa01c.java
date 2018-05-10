package aula3;

public class Programa01c {
	public static void main(String[] args) {
		int x = 10;
		
		
		//Operador Unário

		//--c Realiza  a subtracao e imprime o valor
		//c-- Imprime o valor e depois realiza a subtracao
		

		//++c = Realiza a soma e imprime no novo valor
		//c++ = Imprime o valor e realiza a soma

		/*
		 *          x++     +   --x     +       x++      +        x++
		 *          10      11     10   10      10       11       12        
		 * 
		 */
		 
		System.out.println(x++ + --x + x++ + x++);
		

	}
}
