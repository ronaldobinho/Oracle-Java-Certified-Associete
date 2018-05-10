package aula10;

class A extends Object {
	A() {
		System.out.println("Construtor A()");
	}
	
	A(String nome) {
		System.out.println("Construtor A (String nome)");

	}
}

class B extends A {
	B() {
        
		System.out.println("Construtor B()");
	}
}

public class LetraTeste {
	public static void main(String[] args) {
		new B();

	}
}
