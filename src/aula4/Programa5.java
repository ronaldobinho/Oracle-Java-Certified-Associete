package aula4;

public class Programa5 {
public static void main(String[] args) {
	int n=5, contador=n, fatorial=1;
	
	do{
		fatorial=fatorial*contador;
		System.out.println(fatorial);
		contador-=1;
		System.out.println("fatorial " +fatorial);
		System.out.println("contador" +contador);
	}while(contador>=1);
}
}
