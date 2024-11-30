package com.tiagovieira.estruturasDeDados;

import java.util.Arrays;


public class BubbleSort {

    public static void bubbleSort(double[] vetor) {

        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    double aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;


                }

            }

        }

    }

    public static void main(String[] args) {

        double [] precos = {4.49, 50, 132.80, 3.20, 77.99};

        bubbleSort(precos);

        System.out.println("PREÇOS ORDENADOS DO MAIS BARATO ATÉ O MAIS CARO \n" + Arrays.toString(precos));


    }


}
