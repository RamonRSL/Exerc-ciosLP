package br.com.newtonpaiva.exercicioLP.tratamentoExcecao;

public class Tratamento2TryCatch {
    public static void main(String[] args) {
            int div =5;
            int divisor =5;
            try {
                divide(div, divisor);
            } catch (ArithmeticException e1) {
                System.out.println("Nao pode dividir por zero!");
            } catch (ArrayIndexOutOfBoundsException e2) {
                System.out.println("Favor informar dois numeros!");
            }
        }

        public static void divide(int div, int divisor){
            System.out.println("Divisao = " + (div / divisor));
        }
 }

