package com.tiagovieira.recursao;

import java.util.Scanner;

//Leia o número e calcule e imprima o resultado da sequência de fibonacci
public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número:");
        int n = sc.nextInt();
        System.out.println(fibonacci(n));


    }

}
