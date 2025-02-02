package com.tiagovieira.estruturasDeDados;



public class BuscaBinaria {

    private static final int ARRAY_TAMANHO = 100;

    public static void main(String[] args) {
        int[] array = inicializarArrayOrdenado(ARRAY_TAMANHO);

        int elementoBuscado = 38;
        int resultado = buscaBinaria(array, elementoBuscado);

        System.out.println("Índice do elemento " + elementoBuscado + ": " + resultado);
    }

    public static int[] inicializarArrayOrdenado(int tamanho) {
        int[] array = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            array[i] = i;
        }
        return array;
    }

    public static int buscaBinaria(int[] array, int elemento) {
        int menorIndice = 0;
        int maiorIndice = array.length - 1;

        while (menorIndice <= maiorIndice) {
            int meio = menorIndice + (maiorIndice - menorIndice) / 2;

            if (array[meio] == elemento) {
                return meio;
            } else if (array[meio] > elemento) {
                maiorIndice = meio - 1;
            } else {
                menorIndice = meio + 1;
            }
        }

        return -1; // Elemento não encontrado
    }
}
