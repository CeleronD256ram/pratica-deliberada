package com.tiagovieira.arrays;

import java.util.Arrays;

/* Dado um vetor de inteiros, remova os valores duplicados de forma que cada elemento
   apareça apenas uma vez. Retorne o vetor resultante ordenado. */
public class ValoresDuplicados {
    public static void main(String[] args) {

        int[] vetor = {2, 2, 2, 2, 3, 4, 6, 87, 2, 1};

        Arrays.sort(vetor);

        int tamanho = 1;
        //Determina qual será o tamanho do novo array para alocar os número que não se repetem
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] != vetor[i - 1]) {
                tamanho++;

            }
        }

        int[] vetorDeUnicos = new int[tamanho];
        vetorDeUnicos[0] = vetor[0];

        int index = 1;
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] != vetor[i - 1]) {
                vetorDeUnicos[index++] = vetor[i];

            }
        }

        System.out.println("Novo vetor sem números repetidos:");
        for (int vetorDeUnico : vetorDeUnicos) {
            System.out.print(vetorDeUnico + " ");

        }


    }


}
