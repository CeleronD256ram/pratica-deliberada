package com.tiagovieira.matriz;

public class ProdutoMxM {
    public static void main(String[] args) {

        int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matriz2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};


        if (matriz1.length == matriz2.length) {
            int[][] resultado = new int[matriz1.length][matriz1[0].length];


            //Lógica para múltiplicar as matrizes
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz1[0].length; j++) {
                    resultado[i][j] = matriz1[i][j] * matriz2[i][j];

                }
            }


            System.out.println("Resultado:");
            for (int i = 0; i < resultado.length; i++) {
                for (int j = 0; j < resultado[0].length; j++) {
                    System.out.print(resultado[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Não é possível executar a operação. Matrizes incompatíveis.");
        }
    }
}
