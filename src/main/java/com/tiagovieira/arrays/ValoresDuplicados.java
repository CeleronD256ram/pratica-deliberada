package com.tiagovieira.arrays;

import java.util.Arrays;

/*Dado um vetor de inteiros, remova os valores duplicados de forma que cada elemento
 apareça apenas uma vez. Retorne o vetor resultante ordenado.
 */
public class ValoresDuplicados {
    public static void main(String[] args) {
        int[] vetor = {10, 12, 10, 8, 4, 2, 7, 8, 2};

        Arrays.sort(vetor);

        int[] resultado = removerDuplicados(vetor);

        System.out.println(Arrays.toString(resultado));
    }

    public static int[] removerDuplicados(int[] vetor) {

        int tamanho = 1;
        //Conta quantos números não repetidos tem no array
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] != vetor[i - 1]) {
                tamanho++;

            }


        }
        //Cria um novo array com o tamanho dos elementos não repetidos
        int[] resultado = new int[tamanho];
        resultado[0] = vetor[0]; // o primeiro elemento é sempre único

        int index = 1;
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] != vetor[i - 1]) {
                resultado[index++] = vetor[i];

            }


        }
        return resultado;


    }


}
