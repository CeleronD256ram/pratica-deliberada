package com.tiagovieira.arrays;
import java.util.Random;

/*
Crie um vetor de 10 posições e preencha-o com números aleatórios entre 1 e 100.
Use um laço para imprimir todos os elementos do vetor. Calcule e imprima a soma desses números.
 */

public class SomaAleatoriosVetor {
    public static void main(String[] args) {
        Random random = new Random();

        int[] vetor = new int[10];

        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(1, 100);
            soma += vetor[i];

        }

        System.out.println("\nVetor preenchido com números aleátorios");
        for (int valor : vetor) {
            System.out.print(valor + " ");

        }

        System.out.println("\nA soma dos números aleátorios dentro desse vetor é " + soma);


    }


}
