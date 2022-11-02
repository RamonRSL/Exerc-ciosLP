package br.com.newtonpaiva.exercicioLP.tratamentoExcecao;
public class Tratamento1TryCatch {

    public static void main(String[] args) {
        args = new String[2];
        args[0] = "5";
        args[1] = "0";

        int dividendo = Integer.parseInt(args[0]);
        int divisor = Integer.parseInt(args[1]);
        try {
            divide(dividendo, divisor);
        } catch (ArithmeticException e) {
            System.out.println("Nao pode dividir por zero!");
        }

        }
    public static void divide ( int dividendo, int divisor){
        System.out.println("Divisor = " + (dividendo / divisor));
    }
}