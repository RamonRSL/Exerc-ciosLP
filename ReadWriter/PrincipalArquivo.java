package br.com.newtonpiava.exercicioLP.ReadWriter;

import java.io.IOException;

public class PrincipalArquivo {
    public static void main ( String [] args) throws IOException{
        String path = "/tmp/teste.txt";

        ManipuladorArquivo.escritor(path);
        ManipuladorArquivo.leitor(path);
    }
}
