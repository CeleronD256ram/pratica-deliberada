package com.tiagovieira.estruturasDeDados;

public class InsertionSort {

    public static void main(String[] args) {
        // Vetor a ser ordenado
        int[] vetor = {5, 3, 1, 4, 2};

        // Exibe o vetor antes da ordenação
        System.out.println("Antes da ordenação:");
        imprimirVetor(vetor);

        // Aplica o algoritmo de ordenação por inserção
        insertionSort(vetor);

        // Exibe o vetor após a ordenação
        System.out.println("Depois da ordenação:");
        imprimirVetor(vetor);
    }

    /**
     * Algoritmo de ordenação por inserção.
     *
     * @param vetor O vetor que será ordenado.
     */
    public static void insertionSort(int[] vetor) {
        // Percorre o vetor a partir do segundo elemento
        for (int i = 1; i < vetor.length; i++) {
            // O elemento atual é a "chave" a ser inserida na sublista ordenada
            int chave = vetor[i];

            // Posição inicial do elemento anterior
            int j = i - 1;

            // Move os elementos maiores que a chave uma posição para frente
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }

            // Insere a chave na posição correta
            vetor[j + 1] = chave;
        }
    }

    /**
     * Função para imprimir os elementos de um vetor.
     *
     * @param vetor O vetor a ser impresso.
     */
    public static void imprimirVetor(int[] vetor) {
        // Imprime cada elemento do vetor, separado por um espaço
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
        System.out.println(); // Quebra de linha após imprimir o vetor
    }
}
