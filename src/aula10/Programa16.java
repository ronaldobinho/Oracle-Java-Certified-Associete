package aula10;

/*
 * HIERARQUIA DAS EXCEPTIONS
 * 
 * Throwable
 * Exception / Error
 * 
 * 
 * 
 */
import java.sql.SQLException;

public class Programa16 {
	public static void analisar() throws SQLException {


	}

	public static void main(String[] args) {
		try {
			analisar();
			System.out.println("Sucesso");
		} catch (SQLException e) {
			System.out.println("Erro de Conexão");
		}
	}

}
