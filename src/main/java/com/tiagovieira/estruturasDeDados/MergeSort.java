package com.tiagovieira.estruturasDeDados;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] vetor = {45, 54, 21, 1, 54, 3};
        int[] aux = new int[vetor.length];

        mergeSort(vetor, aux, 0, vetor.length - 1);

        System.out.print("Ordernado: " + Arrays.toString(vetor) + " ");

    }

    public static void mergeSort(int[] vetor, int[] aux, int inicio, int fim) {

        if (inicio < fim) {

            int meio = (inicio + fim) / 2;

            mergeSort(vetor, aux, inicio, meio); // 1 metaded
            mergeSort(vetor, aux, meio + 1, fim);

            intercalar(vetor, aux, inicio, meio, fim);
        }


    }

    private static void intercalar(int[] vetor, int[] aux, int inicio, int meio, int fim) {

        for (int i = inicio; i <= fim; i++) {
            aux[i] = vetor[i];

        }

        int esquerda = inicio;
        int direita = meio + 1;

        for (int i = inicio; i <= fim; i++) {

            if (esquerda > meio) {
                vetor[i] = aux[direita++];

            } else if (direita > fim) {
                vetor[i] = aux[esquerda++];

            } else if (aux[esquerda] < aux[direita]) {
                vetor[i] = aux[esquerda++];

            } else {
                vetor[i] = aux[direita++];

            }

        }




    }


}

