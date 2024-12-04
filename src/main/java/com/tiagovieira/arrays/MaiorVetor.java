package com.tiagovieira.arrays;

/*
Solicite ao usuário para inserir 20 números inteiros. Armazene esses números
em um vetor. Utilize um laço for para separar e imprimir os números pares e ímpares
 */

import java.util.Scanner;

public class MaiorVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[20];

        StringBuilder pares = new StringBuilder();
        StringBuilder impares = new StringBuilder();

        System.out.println("Digite 20 númuros inteiros: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println((i + 1) + "º: ");
            vetor[i] = sc.nextInt();

            if (vetor[i] % 2 == 0) {
                pares.append(vetor[i]).append(" ");

            } else {
                impares.append(vetor[i]).append(" ");
            }

        }


        System.out.println("PARES: " + pares);
        System.out.println("IMPARES: " + impares);






    }

}
