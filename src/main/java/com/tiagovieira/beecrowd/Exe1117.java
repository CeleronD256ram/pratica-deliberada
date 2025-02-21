package com.tiagovieira.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Exe1117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int notasValidas = 0;
        double soma = 0;

        while (notasValidas < 2) {
            double nota = sc.nextDouble();

            if (nota >= 0 && nota <= 10) {
                soma += nota;
                notasValidas++;
            } else {
                System.out.println("nota invalida");
                
            }
            
        }

        double media = soma / 2;
        System.out.printf("media = %.2f\n", media);

    }
}
