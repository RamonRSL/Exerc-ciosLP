package br.com.newtonpaiva.exercicioLP.tratamentoExcecao;

import javax.swing.JOptionPane;

public class Tratamento3TryCatch {
    public static void main ( String [] args) {
        int dividendo, divisor;
        while (true) {
            try {
                dividendo = Integer.parseInt(JOptionPane.showInputDialog("Digite o dividendo: "));
                divisor = Integer.parseInt(JOptionPane.showInputDialog("Digite o divisor: "));

                divide(dividendo, divisor);
                break;
            } catch (ArithmeticException e1) {
                JOptionPane.showMessageDialog(null, "Naopode dividir zero!");

            } catch (NumberFormatException e2) {
                JOptionPane.showMessageDialog(null, "Favor informar apenas numeros inteiros!");
            }
        }


        }

    public static void divide(int div, int divisor){
        System.out.println("Divisao = " + (div / divisor));

    }
}
