package com.tiagovieira.recursao;

public class Primo {
    public static void main(String[] args) {

        int numero = 17;
        System.out.println(verificarPrimo(numero) ? numero + " é primo" : numero + " não é primo");

    }

    private static boolean verificarPrimo(int numero) {
        if (numero <= 1) return false;

        return verificarPrimoRecursivo(numero, 2);

    }

    private static boolean verificarPrimoRecursivo(int numero, int divisor) {
        if (numero == numero) return true;
        if (numero % divisor == 0) return false;

        return verificarPrimoRecursivo(divisor, divisor + 1);

    }


}
