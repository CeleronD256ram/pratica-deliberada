package com.tiagovieira.beecrowd;

import java.util.Scanner;

public class Exe1114SenhaFixa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Invalida");
            senha = sc.nextInt();

        }

        System.out.println("Acesso Permitido");




    }
}
