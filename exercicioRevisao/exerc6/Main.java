package br.com.newtonpaiva.exercicioRevisao.exerc6;
import java.io.IOException;

public class Main {
    public static void main ( String [] args) throws IOException{
        
    	String path = "/tmp/teste.txt";

        Exerc6.escritor(path);
        Exerc6.leitor(path);
    
        if (path.contains("neymar")){
        System.out.println( " Neymar é um dos jogadores preferidos.");
    }
}
}