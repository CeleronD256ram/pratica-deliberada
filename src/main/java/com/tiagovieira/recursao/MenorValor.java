package com.tiagovieira.recursao;

public class MenorValor {
    public static void main(String[] args) {

        int[] valores = {2, 43, 9, 5, 11, 6, 3, 6, 23, 56, 3, 65};

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
