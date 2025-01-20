package com.tiagovieira.estruturasDeDados;

public class QuickSort {

    public static void OrdenarQuickSort(int[] vetor, int esquerda, int direita) {
        if (esquerda < direita) {

            
            int indexPivo = particionar(vetor, esquerda, direita);

            // Ordenar a parte à esquerda do pivô
            OrdenarQuickSort(vetor, esquerda, indexPivo - 1);

            // Ordenar a parte à direita do pivô
            OrdenarQuickSort(vetor, indexPivo + 1, direita);
        }
    }


    public static int particionar(int[] vetor, int esquerda, int direita) {
        // Escolhe o primeiro elemento como pivô
        int pivo = vetor[esquerda];

        while (esquerda <= direita) {
           
            while (vetor[esquerda] < pivo) {
                esquerda++;
            }
            while (vetor[direita] > pivo) {
                direita--;
            }

            
            if (esquerda <= direita) {
                int aux = vetor[esquerda];
                vetor[esquerda] = vetor[direita];
                vetor[direita] = aux;
                esquerda++;
                direita--;
            }
        }
        return esquerda;
    }

    
    public static void main(String[] args) {
        int[] vetor = {10, 7, 8, 9, 1, 5};
        System.out.println("Vetor original:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }

        
        OrdenarQuickSort(vetor, 0, vetor.length - 1);

        System.out.println("\nVetor ordenado:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}
