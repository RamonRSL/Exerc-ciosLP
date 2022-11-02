package br.com.newtonpaiva.exercicioLP.tratamentoExcecao;

import java.util.Scanner;

public class TratamentoEspecifico {
    public static final String SENHASECRETA = "123456";
    public static void main (String [] Args) {

        try {
            Scanner ler = new Scanner(System.in);
            System.out.println("Digite a senha.: ");
            String senha=ler.nextLine ();
            if (!senha.equals(SENHASECRETA)){                           //diferente utiliza !!!!!
                throw new Exception("Senha invalida!!");
            }
            System.out.println("Senha correta!! \nBem vindo(a)!!");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
