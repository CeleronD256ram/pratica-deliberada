package com.tiagovieira.arrays;

/*
Peça ao usuário para inserir 5 números inteiros. Armazene esses números em um vetor.
Use um laço for para imprimir os elementos do vetor em ordem inversa.
*/

import java.util.Scanner;

public class ArrayInverso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[5];

        System.out.println("Digite 5 números:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println((i + 1) + "º: ");
            vetor[i] = sc.nextInt();

        }

        System.out.println("\nVetor invertido:");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");

        }




    }


}
