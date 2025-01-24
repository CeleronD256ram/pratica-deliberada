package com.tiagovieira.livrosElogicasCotidianas;

import java.util.Random;

public class LogicaDoBaralho {

    static Random random = new Random();
    public static void main(String[] args) {
        
    }

    static String[] escolhaNumeroDeCartas(int numCartas) {
        String[] cartasEscolhidas = new String[numCartas];

        for(int i = 0; i < numCartas; i++) {
            cartasEscolhidas[i] = valoresAleatorios() + " de " + naipAleatorio();
        }

        return cartasEscolhidas;
    }

    static String valoresAleatorios() {
        int valor = random.nextInt(1, 14);

        if (valor == 1) {
            return "As";
        }
        if (valor == 11) {
            return "Valete";
        }
        if (valor == 12) {
            return "Rainha";
        }
        if (valor == 13) {
            return "Rei";
        }

        String valorConvertido  = String.valueOf(valor);

        return valorConvertido;

    }

    static String naipAleatorio() {

        int valor = random.nextInt(1, 5);

        if (valor == 1) {
            return "Espadas";
        }
        if (valor == 2) {
            return "Copas";
        }
        if (valor == 3) {
            return "Paus";
        }

        return "Ouros";
    }

    
}
