package br.com.newtonpaiva.exercicioRevisao;
import javax.swing.JOptionPane;
public class Exer2 {
	
	public static void main (String [] args) {

	int tempo1;
	double valor, result;
	
	tempo1=Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de pessoas no jogo: "));
	valor=Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do ingresso: "));
	result=tempo1*valor;
	JOptionPane.showMessageDialog(null, "O valor de arrecadação do primeiro jogo de abertura da copa do mundo foi: " + result,"arrecadação",1 );
	

}
}