package com.tiagovieira.beecrowd;

import java.util.Scanner;

public class Exe1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1º tipo: ");
        String tipo1 = sc.nextLine();  // vertebrado ou invertebrado
        System.out.println("2º tipo: ");
        String tipo2 = sc.nextLine();
        System.out.println("3º tipo: ");
        String tipo3 = sc.nextLine();

        if (tipo1.equals("vertebrado")) {
            if (tipo2.equals("ave")) {
                if (tipo3.equals("carnivoro")) {
                    System.out.println("aguia");

                } else {
                    System.out.println("pomba");
                }

            } else if (tipo2.equals("mamifero")) {
                if (tipo3.equals("onivoro")) {
                    System.out.println("homem");

                } else {
                    System.out.println("vaca");

                }

            }

        } else if (tipo1.equals("invertebrado")) {
            if (tipo2.equals("inseto")) {
                if (tipo3.equals("hematofago")) {
                    System.out.println("pulga");

                } else {
                    System.out.println("lagarta");

                }

            } else if (tipo2.equals("anelideo")) {
                if (tipo3.equals("hematofago")) {
                    System.out.println("sanguessuga");

                } else {
                    System.out.println("miconhoca");
                }

            }

        }


    }
}
