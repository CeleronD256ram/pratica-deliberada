package com.tiagovieira.exemplosDeUso;

import java.io.File;
import java.util.Scanner;

public class ManipularPastas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Caminho da pasta");
        String caminho = "\"C:\\Users\\celer\\Desktop\\PastaTestePath\"";

        File arquivo = new File(caminho);

        //pegando lista de todas as pastas dentro da pasta
        File[] pastas = arquivo.listFiles(File::isDirectory);

        System.out.println("PASTAS: ");
        System.out.println("-------------------------------");
        for (File pasta : pastas) {
            System.out.println(pasta);

        }



    }


}
