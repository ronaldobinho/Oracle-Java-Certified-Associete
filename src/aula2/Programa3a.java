package aula2;


/* TIPOS PRIMITIVOS (SEMPRE COME�AM COM LETRA MINUSCULA)
 * byte - 8 bits (-128 � 127)
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
	//Quando realizamos uma opera��o matem�tica os numeros s�o convertivos em int, por este fato a express�o byte c=a+b da erro
	
	//Casting � for�ar e comprimir a v�riavel para que ela exiba/recebe um valor
	byte c=(byte) (a+b);
	
	//System.out.println(c);
	
	//Casting
	float ronaldo=(float)9.5;
	
	Integer x=10;
	
	//float ronaldo = (float) 9.5;
	
	float ronaldo1 = 9.5f;
}
}
