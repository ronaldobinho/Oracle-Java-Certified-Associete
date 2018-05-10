package aula1;

import javax.swing.JOptionPane;

public class Programa7 {
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite um Valor");
	    String valor2 = JOptionPane.showInputDialog("Digite o Segundo Valor");
	    Double total;

	    
	    Double numero1 = Double.parseDouble(valor2);
	    Double numero2 = Double.parseDouble(valor1);
        
	    total = (numero1 + numero2);	    
	    JOptionPane.showMessageDialog(null, total);
		
	    
	}

}
