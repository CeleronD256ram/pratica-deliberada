package com.tiagovieira.livroDeitel;

public class ArraysPag204 {
    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Efeitos de passar a referência de um array inteiro:\n" +
                "Os valores do array original são:");

        // Exibe os elementos do array original
        for (int value : array) {
            System.out.printf(" %d", value);
        }

        // Passa a referência do array para o metodo modifyArray
        modifyArray(array);
        System.out.println("\n\nOs valores do array modificado são:");

        // Exibe os elementos do array após a modificação
        for (int value : array) {
            System.out.printf(" %d", value);
        }

        // Demonstra os efeitos de passar um elemento individual do array
        System.out.printf("\n\nEfeitos de passar o valor de um elemento do array:\n" +
                "array[3] antes de modifyElement: %d\n", array[3]);

        // Passa um elemento individual do array para modifyElement
        modifyElement(array[3]);
        System.out.printf("array[3] após modifyElement: %d\n", array[3]);
    }

    // Multiplica cada elemento de um array por 2
    public static void modifyArray(int[] array2) {
        for (int i = 0; i < array2.length; i++) {
            array2[i] *= 2;
        }
    }

    // Multiplica o argumento por 2 (não afeta o array original)
    public static void modifyElement(int element) {
        element *= 2;
        System.out.printf("Valor do elemento dentro de modifyElement: %d\n", element);
    }
}


