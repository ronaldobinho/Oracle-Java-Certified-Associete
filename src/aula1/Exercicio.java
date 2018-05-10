package aula1;

import javax.swing.JOptionPane;

public class Exercicio {
public static void main(String[] args) {
	
	JOptionPane.showMessageDialog(null, "Multiplicador");
	int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro  valor"));
	int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));	
	
	int multiplicacao = (numero1 * numero2);
	
	JOptionPane.showMessageDialog(null, "= "+multiplicacao, "Resultado", JOptionPane.INFORMATION_MESSAGE);
}
}
