package com.tiagovieira.beecrowd;

import java.util.Scanner;

public class Exe1151 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }


    }

    public static int fibonacci(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }


}
