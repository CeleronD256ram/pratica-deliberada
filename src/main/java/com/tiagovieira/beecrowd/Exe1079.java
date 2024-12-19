package com.tiagovieira.beecrowd;

import java.util.Scanner;

public class Exe1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Quantidade de casos de teste
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            String parOuImpar = (x % 2 == 0) ? "PAR" : "IMPAR";
            String positivoOuNegativo = (x > 0) ? "POSITIVO" : "NEGATIVO";

            System.out.println(parOuImpar + " " + positivoOuNegativo);

        }





    }


}
