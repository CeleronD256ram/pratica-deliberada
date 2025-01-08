package com.tiagovieira.recursao;

import java.util.Random;

public class MenorValor {
    public static void main(String[] args) {
        Random random = new Random();

        int[] valores = new int[10];
        for (int i = 0; i < valores.length; i++) {
            valores[i] = random.nextInt(9) * i;

        }

        System.out.println("Vetor: ");
        for (int valor : valores) {
            System.out.print(valor + " ");

        }


        int menorValor = menorValor(valores);
        System.out.println("O menor valor encontrado no Array foi o " + menorValor);


    }

    private static int menorValor(int[] array) {
        return menorValorRecursivo(array, 0, array.length - 1);

    }

    private static int menorValorRecursivo(int[] array, int inicio, int fim) {
        if (inicio == fim) {
            return array[inicio];
        } else {

            int meio = (inicio + fim) / 2;
            int menorEsquerda = menorValorRecursivo(array, inicio, meio);
            int menorDireita = menorValorRecursivo(array, meio + 1, fim);

            return Math.min(menorEsquerda, menorDireita);


        }


    }


}
