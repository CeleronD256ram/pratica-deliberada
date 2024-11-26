package com.tiagovieira.matriz;

/*Dado um vetor v de tamanho n e uma matriz A de tamanho nxn,
crie um programa para calcular o produto v*A, resultando em um novo vetor.
 */

public class ProdutoVetorMatriz {
    public static void main(String[] args) {

        int[] vetor = {1, 2, 3};
        int[][] matriz = {{2, 3, 1}, {4, 0, 5}, {7, 6, 8}};

        int[] resultado = new int[matriz[0].length];


        for (int i = 0; i < matriz[0].length; i++) {
            int soma = 0;
            for (int j = 0; j < vetor.length; j++) {
                soma += vetor[j] * matriz[j][i];

            }
            resultado[i] = soma;

        }

        System.out.println("Resultado:");
        for (int valor : resultado) {
            System.out.print(valor + " ");
        }


    }


}
