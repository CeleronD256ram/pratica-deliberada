package com.tiagovieira.calculos;

import java.util.Scanner;

// cálculo da sequência de Collatz:
public class SequenciaDeCollatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número para a sequência: ");
        int n = sc.nextInt();

        int passos = calculaCollatz(n);

        System.out.println("Passos necessários: " + passos);
    }

    public static int calculaCollatz(int n) {
        int quantidadeDePassos = 0;

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            quantidadeDePassos++;
        }
        return quantidadeDePassos;

    }


}
