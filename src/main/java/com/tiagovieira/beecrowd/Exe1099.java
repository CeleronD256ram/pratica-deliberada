package com.tiagovieira.beecrowd;

import java.util.Scanner;

public class Exe1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int soma = 0;


            if (x > y) {
                int temp = x;
                x = y;
                y = temp;
            }

            for (int j = x + 1; j < y; j++) {
                if (j % 2 != 0) {
                    soma += j;
                }
            }

            System.out.println(soma);
        }

        sc.close();

    }
}
