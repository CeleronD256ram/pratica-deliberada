package com.tiagovieira.beecrowd;

import java.util.Scanner;

public class Exe1073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                int resposta = (int) Math.pow(i, 2);
                System.out.println(i + "^2 = " + resposta);

            }


        }

    }
}
