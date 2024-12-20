package com.tiagovieira.beecrowd;

import java.util.Scanner;

public class Exe1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maior = 0;
        int posicao = 0;

        for (int i = 1; i <= 100; i++) {
            int numero = sc.nextInt();

            if (numero > maior) {
                maior = numero;
                posicao = i;

            }


        }

        System.out.println(maior);
        System.out.println(posicao);


    }
}
