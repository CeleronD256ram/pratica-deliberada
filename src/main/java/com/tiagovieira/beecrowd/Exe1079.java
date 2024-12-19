package com.tiagovieira.beecrowd;

import java.util.Scanner;

public class Exe1079 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        //quantidade de testes
        int N = SC.nextInt();


        for (int i = 0; i < N; i++) {
            int numero = SC.nextInt();


            if (numero == 0) {
                System.out.println("NULL");
            } else {

                String paridade = (numero % 2 == 0) ? "EVEN" : "ODD";


                String sinal = (numero > 0) ? "POSITIVE" : "NEGATIVE";


                System.out.println(paridade + " " + sinal);
            }
        }


    }


}
