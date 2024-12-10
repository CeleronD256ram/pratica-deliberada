package com.tiagovieira.beecrowd;

import java.util.Scanner;

public class Exe1029 {
    static int callCount; // Variável para contar as chamadas recursivas

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas casos você quer testar?");
        int testCases = sc.nextInt();


        for (int i = 0; i < testCases; i++) {
            callCount = 0; // Reseta o contador para cada caso de teste
            System.out.println("Digite o " + (i + 1) + "º número:");
            int n = sc.nextInt();
            int fibValue = fib(n); // Calcula o Fibonacci usando recursão
            System.out.printf("fib(%d) = %d calls = %d%n", n, callCount - 1, fibValue);
        }

        sc.close();
    }


    public static int fib(int n) {
        callCount++; // Incrementa o contador a cada chamada
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }


}
