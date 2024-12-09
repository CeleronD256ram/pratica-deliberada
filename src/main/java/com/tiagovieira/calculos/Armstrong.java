package com.tiagovieira.calculos;

import java.util.Locale;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número:");
        int numeroOriginal = scanner.nextInt();

        int quantidadeDigitos = String.valueOf(numeroOriginal).length();
        int somaPotencias = 0;
        int numeroTemporario = numeroOriginal;

        while (numeroTemporario > 0) {
            int ultimoDigito = numeroTemporario % 10;
            somaPotencias += (int) Math.pow(ultimoDigito, quantidadeDigitos);
            numeroTemporario /= 10; // Remove o último dígito
        }

        if (somaPotencias == numeroOriginal) {
            System.out.println(numeroOriginal + " é um número Armstrong.");
        } else {
            System.out.println(numeroOriginal + " não é um número Armstrong.");
        }

        scanner.close();
    }
}
