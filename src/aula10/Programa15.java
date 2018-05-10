package aula10;

import java.util.IllegalFormatConversionException;

public class Programa15 {

	public static void main(String[] args) {

		for (int contador = 0; contador <= 3; contador++)
			try {
				System.out.printf("%f", 10.0);

			} catch (IllegalFormatConversionException i) {
				System.out.println("Conversão Ilegal : " + i.getClass());
			} finally {
				System.out.println(contador + "Erros ");

			}

	}
}
