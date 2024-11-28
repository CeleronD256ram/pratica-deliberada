package com.tiagovieira.matriz;

import java.util.Scanner;

public class QuadradoMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de 2 a 5");
        int n;
        do {
            n = sc.nextInt();
            if (n < 2 || n > 5) {
                System.out.println("Número fora do intervalo, digite novamente:");
            }
        } while (n < 2 || n > 5);

        int[][] matriz = new int[n][n];

        int valor = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = valor++;
            }
        }

        int[][] resultado = new int[n][n];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                resultado[i][j] = matriz[i][j] * matriz[i][j];
            }
        }


        System.out.println("Resultado:");
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }


    }
}
