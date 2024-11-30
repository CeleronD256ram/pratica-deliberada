package com.tiagovieira.recursao;

public class SomaVetor {

    public static int somaVetor(int[] vetor, int indice) {
        if (indice < 0 ) {
            return 0;

        }
        return vetor[indice] + somaVetor(vetor, indice - 1);

    }

    public static void main(String[] args) {


        int[] vetor = {1, 2, 3, 4, 5};
        int resposta = 0;

        for (int i = 0; i < vetor.length; i++) {
            resposta = somaVetor(vetor, i);

        }
        System.out.println("A soma dos números no vetor é " + resposta);

    }


}
