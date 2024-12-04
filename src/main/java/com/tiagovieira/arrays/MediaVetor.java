package com.tiagovieira.arrays;

import java.util.Scanner;

/*
 Peça ao usuário para inserir a quantidade de números que ele deseja armazenar. Em seguida, solicite os números e armazene-os
em um vetor. Use um laço for para calcular e imprimir a média desses números.
 */
public class MediaVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos números deseja armazenar no vetor:");
        int quantidadeNumeros = sc.nextInt();

        int[] vetor = new int[quantidadeNumeros];
        int soma = 0;


        System.out.println("\nDigite os números para armazenar em cada posição do vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            vetor[i] = sc.nextInt();
            soma += vetor[i];

        }

        double media = (double) soma / vetor.length;


        System.out.print("A média dos números  do vetor é " + media);





    }
}
