package aula2;


/* TIPOS PRIMITIVOS (SEMPRE COMEÇAM COM LETRA MINUSCULA)
 * byte - 8 bits (-128 á 127)
 * short - 16 bits
 * int - 32 bits
 * long - 64 bits
 * float - 32 bits
 * double - 64 bits
 * char - 16 bits
 * boolean - true or false
 * 
 */

public class Programa3a {
public static void main(String[] args) {
	byte a=100;
	byte b=27;
	// byte c=a+b;
	//Quando realizamos uma operação matemática os numeros são convertivos em int, por este fato a expressão byte c=a+b da erro
	
	//Casting é forçar e comprimir a váriavel para que ela exiba/recebe um valor
	byte c=(byte) (a+b);
	
	//System.out.println(c);
	
	//Casting
	float ronaldo=(float)9.5;
	
	Integer x=10;
	
	//float ronaldo = (float) 9.5;
	
	float ronaldo1 = 9.5f;
}
}
