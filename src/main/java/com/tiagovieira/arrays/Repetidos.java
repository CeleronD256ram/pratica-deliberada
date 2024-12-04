package com.tiagovieira.arrays;

/*
Crie um programa que peça ao usuário para inserir 10 números inteiros. Armazene esses números em um vetor.
Use um laço para contar e imprimir quantas vezes cada número aparece no vetor.
 */

import java.util.Scanner;

public class Repetidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] contagem = new int[10];


        System.out.println("Por favor, insira 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Conta as ocorrências de cada número
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    contagem[i]++;
                }
            }
        }

        // Exibe os números e suas respectivas ocorrências (evita duplicados na saída)
        System.out.println("\nContagem de números:");
        for (int i = 0; i < numeros.length; i++) {
            boolean jaImprimiu = false;
            for (int j = 0; j < i; j++) {
                if (numeros[i] == numeros[j]) {
                    jaImprimiu = true;
                    break;
                }
            }
            if (!jaImprimiu) {
                System.out.println("Número " + numeros[i] + " aparece " + contagem[i] + " vez(es).");
            }
        }


    }

}
