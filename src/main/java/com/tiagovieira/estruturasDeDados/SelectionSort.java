package com.tiagovieira.estruturasDeDados;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            // Encontra o índice do menor elemento no restante do array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Troca o elemento atual com o menor elemento encontrado
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {29, 10, 14, 37, 13};

        System.out.println("Array antes da ordenação:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        selectionSort(array);

        System.out.println("\nArray após a ordenação:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }



}
