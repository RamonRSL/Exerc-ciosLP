package br.com.newtonpaiva.exercicioRevisao.exerc6;

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;

public class Exerc6 {
    public static void leitor (String path) throws IOException {
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
    public static void escritor (String path) throws IOException{
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
        Scanner in = new Scanner (System.in);
        
        String j1,j2,j3,j4;
        String linha = "";
                
        
        System.out.println("escreva o nome de 5 jogadores: \nPrimeiro: ");
        linha = in.nextLine();
        System.out.println("Segundo: ");
        j1 = in.nextLine();
        System.out.println("Terceiro: ");
        j2 = in.nextLine();
        System.out.println("Quarto: ");
        j3 = in.nextLine();
        System.out.println("Quinto: ");
        j4 = in.nextLine();
        
        bufferedWriter.append(linha + "\n" + j1+"\n" +j2+"\n" +j3+"\n" +j4+"\n" );
        bufferedWriter.close();
    }
}