package com.tiagovieira.recursao;

public class SomaDigitos {
    public static void main(String[] args) {

        int numero = 123;

        int somaDigitos = somaDigitos(numero);
        System.out.println("Resultado da soma dos digitos de forma recursiva: " + somaDigitos);


    }

    private static int somaDigitos(int numero) {
        if (numero < 10) {
            return numero;
        } else {
            return numero % 10 + somaDigitos(numero / 10);
        }


    }


}
