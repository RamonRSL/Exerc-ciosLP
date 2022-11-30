package br.com.newtonpaiva.exercicioRevisao;
import javax.swing.JOptionPane;
public class Exerc1 {

	public static void main (String [] args) {
	String nome, selecao;
	
	nome= JOptionPane.showInputDialog("Insira o nome do jogador: ");
	selecao=JOptionPane.showInputDialog("Insira o nome da selecao: ");
	
	JOptionPane.showMessageDialog(null, "O nome do jogador é: " + nome + "\nO nome da seleção é:  " + selecao, "time" , 1);
	
	}
	
}
