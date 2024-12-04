package com.tiagovieira.arrays;

import java.util.Scanner;

/*
Crie um programa que peça ao usuário para inserir 15 números inteiros. Armazene esses números em um vetor. Use um laço while
para encontrar e imprimir o maior e o menor número do vetor.
 */
public class MaiorComWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[15];

        System.out.println("Digite 15 números:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println((i + 1) + "º:");
            vetor[i] = sc.nextInt();

        }

        int maior = 0;
        int menor = 0;
        int count = 0;

        while (count < vetor.length) {
            if (vetor[count] > maior) {
                maior = vetor[count];

            }
            if (vetor[count] < vetor.length) {
                menor = vetor[count];
            }
            count++;


        }

        System.out.println("O maior número do array é " + maior + " e o menor " + menor);


    }


}
