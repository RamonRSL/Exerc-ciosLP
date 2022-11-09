package br.com.newtonpiava.exercicioLP.ReadWriter;

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;

public class ManipuladorArquivo {
    public static void leitor (String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));  // serve para ler BufferedReader, o outro serve para escrever
        String linha = "";
        while (true){
            if (linha != null){
                System.out.println(linha);
            }
            else
                break;
            linha = buffRead.readLine();
        }
          buffRead.close();
    }
    public static void escritor (String path) throws IOException{
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
        String linha = "";
        Scanner in = new Scanner (System.in);
        System.out.println("Escreva algo: ");
        linha = in.nextLine();
        bufferedWriter.append(linha + "\n");
        bufferedWriter.close();
    }
}
