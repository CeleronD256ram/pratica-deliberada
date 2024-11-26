package com.tiagovieira.estruturasDeDados;

public class HeapSort {

    public static void main(String[] args) {
        // Vetor de entrada para ordenação
        int[] vetor = {2, 4, 6, 1, 77, 12, 5};
        int n = vetor.length;

        // Construir o heap máximo (max-heap) a partir do vetor
        // O loop inicia do último nó não folha até a raiz
        for (int i = n / 2 - 1; i >= 0; i--) {
            aplicarHeap(vetor, n, i);
        }

        // Extraindo os elementos um por um do heap e ajustando a estrutura
        for (int i = n - 1; i >= 0; i--) {
            // Troca o maior elemento (raiz do heap) com o último elemento não ordenado
            int aux = vetor[0];
            vetor[0] = vetor[i];
            vetor[i] = aux;

            // Reaplica o heap para garantir que o restante do vetor esteja ordenado
            aplicarHeap(vetor, i, 0);
        }

        // Exibe o array ordenado
        System.out.println("\nARRAY ORDENADO: ");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
    }

    /**
     * Função que aplica o heap máximo (max-heap) no vetor.
     *
     * @param vetor O array que será ajustado.
     * @param n     O tamanho do heap.
     * @param i     O índice do nó atual que será ajustado.
     */
    public static void aplicarHeap(int[] vetor, int n, int i) {
        int raiz = i; // Assume que o nó atual é a raiz
        int esquerda = 2 * i + 1; // Índice do filho à esquerda
        int direita = 2 * i + 2; // Índice do filho à direita

        // Verifica se o filho da esquerda é maior que a raiz
        if (esquerda < n && vetor[esquerda] > vetor[raiz]) {
            raiz = esquerda;
        }

        // Verifica se o filho da direita é maior que o maior entre raiz e esquerda
        if (direita < n && vetor[direita] > vetor[raiz]) {
            raiz = direita;
        }

        // Se a raiz mudou, realiza a troca e ajusta o heap recursivamente
        if (raiz != i) {
            int aux = vetor[i];
            vetor[i] = vetor[raiz];
            vetor[raiz] = aux;

            // Chamada recursiva para ajustar o sub-heap
            aplicarHeap(vetor, n, raiz);
        }
    }
}
