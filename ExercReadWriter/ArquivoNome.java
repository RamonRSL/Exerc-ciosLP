package br.com.newtonpiava.exercicioLP.ExercReadWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class ArquivoNome {

    public static void leitor (String path) throws IOException{
    BufferedReader buffRead = new BufferedReader(new FileReader(path));
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

    public static void leitor1 (String path1) throws IOException{
        BufferedReader buffRead = new BufferedReader(new FileReader(path1));
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


    public static void leitor2 (String path2) throws IOException{
        BufferedReader buffRead = new BufferedReader(new FileReader(path2));
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


    public static void escritor (String path2) throws IOException{
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path2));
        String linha = "";
        System.out.println(bufferedWriter.append(linha + "\n"));
        //bufferedWriter.append(linha + "\n");
        bufferedWriter.close();
    }
}
