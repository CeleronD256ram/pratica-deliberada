package com.tiagovieira.estruturasDeDados;

public class BuscaBinaria {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;

        }
        System.out.println(buscaBinaria(array, 38));


    }


    public static int buscaBinaria(int[] array, int elemento) {
        int menorIndice = 0;
        int maiorIndice = array.length - 1;

        int meio = 0;
        int chute = 0;

        while (menorIndice <= maiorIndice) {
            meio = (menorIndice + maiorIndice) / 2;
            chute = array[meio];

            if (chute == elemento) {
                return meio;

            } else if (chute > elemento) {
                maiorIndice = meio - 1;

            } else {
                menorIndice = meio + 1;
            }


        }

        return  - 1;


    }

}
