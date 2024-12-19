package com.tiagovieira.exemplosDeUso;

public class Varargs {
    public static void main(String[] args) {

        System.out.println("Soma de 1 + 2: " + soma(1, 2));


        System.out.println("Soma de 1 + 2 + 3: " + soma(1, 2, 3));


        int[] vetor = {1, 2, 3, 4, 5};
        System.out.println("Soma de um vetor: " + soma(vetor));


        System.out.println("Soma de vários números: " + soma(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    /**
     * Método que soma dois números fixos.
     *
     * @param a Primeiro número
     * @param b Segundo número
     * @return Soma de a e b
     */
    static int soma(int a, int b) {
        return a + b;
    }

    /**
     * Método que soma três números fixos.
     *
     * @param a Primeiro número
     * @param b Segundo número
     * @param c Terceiro número
     * @return Soma de a, b e c
     */
    static int soma(int a, int b, int c) {
        return a + b + c;
    }

    /**
     * Método que soma os elementos de um array de inteiros.
     *
     * @param vetor Array de inteiros
     * @return Soma de todos os elementos do array
     */
    static int soma(int[] vetor) {
        int total = 0;

        // Percorre o array somando os elementos
        for (int i = 0; i < vetor.length; i++) {
            total += vetor[i];
        }

        return total;
    }

    /**
     * Método que soma dois números fixos e uma quantidade variável de números adicionais.
     * Usa varargs para permitir flexibilidade.
     *
     * @param a       Primeiro número
     * @param b       Segundo número
     * @param numeros Números adicionais (varargs)
     * @return Soma de todos os números
     */
    static int soma(int a, int b, Integer... numeros) {
        int total = a + b; // Começa somando os dois primeiros números

        // Percorre o varargs somando os números adicionais
        for (int numero : numeros) {
            total += numero;
        }

        return total;
    }
}
