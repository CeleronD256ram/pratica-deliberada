package com.tiagovieira.calculos;

import java.util.Locale;
import java.util.Scanner;

public class Imc {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu peso aqui:");
        double P = sc.nextDouble();

        System.out.println("Digite a sua altura aqui:");
        double A = sc.nextDouble();

        double imc = P / (A * A);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");

        } else if (imc <= 29.5) {
            System.out.println("Saúdavel");

        } else if (imc <= 39.5) {
            System.out.println("Sobrepeso");

        } else {
            System.out.println("Obesidade");
        }

    }

}

