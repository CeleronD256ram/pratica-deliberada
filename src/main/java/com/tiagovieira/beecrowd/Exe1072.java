package com.tiagovieira.beecrowd;

import java.util.Scanner;

public class Exe1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        /*
        como queremos percorrer de x ate y, garantimos que x é menor que y, se não for a gente inverte.
         */
        if (X > Y) {
            int temp = X;
            X = Y;
            Y = temp;
        }

        int soma = 0;
        for (int i = X + 1; i < Y; i++) {
            if (i % 2 != 0) {
                soma += i;
            }

        }
        System.out.println(soma);


    }
}
