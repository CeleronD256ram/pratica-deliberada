package com.tiagovieira.beecrowd;

import java.util.Scanner;

public class Exe1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de X:");
        int x = sc.nextInt();


        int count = 0;
        while (count < 6) {
            if (x % 2 != 0) {
                System.out.println(x);
                count++;
            }
            x++;



        }


    }
}
