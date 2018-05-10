package Exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class calculoNotas {

	public static void calcularNotas() {
		Scanner entrada = new Scanner(System.in);
		
		int opcao = 0;
		int nota1 = 0;
		int nota2 = 0;
		int resultado = 0;
		 JOptionPane.showMessageDialog(null, "******* CALCULO DE NOTAS ********");
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Calcular Notas \n2 - Sair"));
						
		if(opcao != 2){
			nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a Primeira Nota :"));
			nota2 =	Integer.parseInt(JOptionPane.showInputDialog("Digite a Segunda Nota :"));
			resultado = (nota1 + nota2)/2;
			
		     if(resultado >= 5){
		    	 JOptionPane.showMessageDialog(null, "Aprovado  "+ "Nota :" + resultado);
		     }else if (resultado <= 3 ){
		    	 JOptionPane.showMessageDialog(null, "Reprovado  "+ "Nota :" + resultado);		    	 
		     }else
		    	 JOptionPane.showMessageDialog(null, "Recuperação "+ "Nota :"+ resultado);
			}else 
				 JOptionPane.showMessageDialog(null, "Saindo...");
		        
		
			

	}

	public static void main(String[] args) {
		calcularNotas();

	}

}
