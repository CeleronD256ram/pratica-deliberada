package com.tiagovieira.arrays;

/*
Crie um programa que peça ao usuário para inserir 10 números inteiros. Armazene esses números em um vetor.
Conte e imprima quantos desses números são positivos e quantos são negativos.
 */

import java.util.Scanner;

public class QuantidadePositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];

        int negativos = 0;
        int positivo = 0;

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println((i + 1) + "º: ");
            vetor[i] = sc.nextInt();

            if (vetor[i] < 0) {
                negativos++;
            }
            if (vetor[i] >= 0) {
                positivo++;
            }

        }

        System.out.println(negativos + " números negativos encontrados no vetor");
        System.out.println(positivo + " números positivos encontrados no vetor");


    }
}
