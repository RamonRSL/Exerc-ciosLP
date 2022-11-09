package br.com.newtonpiava.exercicioLP.ExercReadWriter;
import br.com.newtonpiava.exercicioLP.ReadWriter.ManipuladorArquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "/tmp/nome.txt";
        String path1 = "/tmp/sobrenome.txt";
        String path2 = "/tmp/nomeSobrenome.txt";

       // ArquivoNome.escritor(path2);

        ArquivoNome.leitor(path);
        ArquivoNome.leitor1(path1);
        ArquivoNome.leitor2(path2);


    }
    public static void escritor (String path2) throws IOException{
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path2));
        bufferedWriter.append(path2 + "\n");
        bufferedWriter.close();
    }

}
