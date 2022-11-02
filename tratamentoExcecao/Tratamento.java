package br.com.newtonpaiva.exercicioLP.tratamentoExcecao;

import java.util.Scanner;

public class Tratamento {
    public static void main (String [] Args){
        Scanner ler = new Scanner(System.in);

        try{
            System.out.println("Digite um valor inteiro.: ");
            int num=ler.nextInt();
            System.out.println("Digite um valor inteiro.: ");
            int num1=ler.nextInt();

            System.out.println(num+" + " + num1 + " = " + (num+num1));
            } catch(Exception ex){
            System.out.println("Erro - Valor digitado nao é um numero inteiro!");

        }
    }
}
