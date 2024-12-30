package com.tiagovieira.beecrowd;

import java.util.Scanner;

public class Exe1094Experiencias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantiaTestes = sc.nextInt();

        int totalCoelhos = 0;
        int totalRatos = 0;
        int totalSapos = 0;

        for (int i = 0; i < quantiaTestes; i++) {
            int quantidadeCobaias = sc.nextInt();
            char tipoCobaia = sc.next().charAt(0); // Lê o tipo de cobaia ('C', 'R' ou 'S')


            if (tipoCobaia == 'C') {
                totalCoelhos += quantidadeCobaias;
            } else if (tipoCobaia == 'R') {
                totalRatos += quantidadeCobaias;
            } else if (tipoCobaia == 'S') {
                totalSapos += quantidadeCobaias;
            }
        }

        // Calcula o total geral de cobaias
        int totalCobaias = totalCoelhos + totalRatos + totalSapos;

        // Exibe os resultados
        System.out.println("Total: " + totalCobaias + " cobaias");
        System.out.println("Total de coelhos: " + totalCoelhos);
        System.out.println("Total de ratos: " + totalRatos);
        System.out.println("Total de sapos: " + totalSapos);

        // Calcula e exibe os percentuais de cada tipo de cobaia
        System.out.printf("Percentual de coelhos: %.2f %%\n", (totalCoelhos * 100.0) / totalCobaias);
        System.out.printf("Percentual de ratos: %.2f %%\n", (totalRatos * 100.0) / totalCobaias);
        System.out.printf("Percentual de sapos: %.2f %%\n", (totalSapos * 100.0) / totalCobaias);

        sc.close();
    }
}
