package com.tiagovieira.matriz;

import java.util.Scanner;

public class Transposta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de linhas:");
        int n = sc.nextInt(); // linhas
        System.out.println("Digite o número de colunas:");
        int m = sc.nextInt(); // colunas

        int[][] matriz = new int[n][m];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) Math.floor(Math.random() * n); // Número aleatório até o limite de n
            }
        }


        System.out.println("Matriz atual:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }


        int[][] transposta = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }


        System.out.println("Resultado:");
        for (int i = 0; i < transposta.length; i++) {
            for (int j = 0; j < transposta[i].length; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }
    }
}
