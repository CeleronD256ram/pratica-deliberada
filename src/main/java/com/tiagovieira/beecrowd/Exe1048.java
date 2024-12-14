package com.tiagovieira.beecrowd;

import java.util.Scanner;

public class Exe1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do salário:");
        double salario = sc.nextDouble();


        double reajuste;
        double novoSalario;
        int percentual;


        if (salario <= 400.00) {
            percentual = 15;
            reajuste = salario * 0.15;
        } else if (salario <= 800.00) {
            percentual = 12;
            reajuste = salario * 0.12;
        } else if (salario <= 1200.00) {
            percentual = 10;
            reajuste = salario * 0.10;
        } else if (salario <= 2000.00) {
            percentual = 7;
            reajuste = salario * 0.07;
        } else {
            percentual = 4;
            reajuste = salario * 0.04;
        }


        novoSalario = salario + reajuste;


        System.out.printf("Novo salario: %.2f%n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f%n", reajuste);
        System.out.printf("Em percentual: %d %%\n", percentual);

        sc.close();
    }
}
