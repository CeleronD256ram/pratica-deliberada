package com.tiagovieira.recursao;

public class Fatorial {

    public static int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int numero = 10;
        int resultado = fatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }
}
