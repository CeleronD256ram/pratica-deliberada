package com.tiagovieira.recursao;

public class torreDeHanoi {
    public static void main(String[] args) {

        int numDiscos = 3;

        resolverTorre(numDiscos, 'A', 'B', 'C');


    }

    //Método recursivo que resolve o problema
    private static void resolverTorre(int numDiscos, char origem, char temp, char destino) {
        //Caso base
        if (numDiscos == 1) {
            System.out.println("Mover disco 1 de " + origem + " para " + destino);
        } else {
            resolverTorre(numDiscos - 1, origem, destino, temp);

            System.out.println("Mover disco " + numDiscos + " de " + origem + " para " + destino);
        }


    }


}
