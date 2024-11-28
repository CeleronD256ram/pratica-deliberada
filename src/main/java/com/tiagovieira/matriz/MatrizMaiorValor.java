package com.tiagovieira.matriz;

public class MatrizMaiorValor {
    public static void main(String[] args) {

        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int maiorValor = Integer.MIN_VALUE;
        int maiorLinha = 0, maiorColuna = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                    maiorLinha = i;
                    maiorColuna = j;

                }

            }

        }

        System.out.println("Maior valor: " + maiorValor + " | linha[" + maiorLinha + "]" + " coluna[" + maiorColuna + "]");

    }


}
