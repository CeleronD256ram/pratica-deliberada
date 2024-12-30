package com.tiagovieira.beecrowd;

public class Exe1097 {
    public static void main(String[] args) {


        int i = 1;

        int j = 7;

        // Enquanto I for menor ou igual a 9, continue o loop
        while (i <= 9) {
            // Laço interno para imprimir os valores de J
            for (int count = 0; count < 3; count++) {
                // Imprime os valores atuais de I e J
                System.out.println("I=" + i + " J=" + j);

                // Decrementa J em 1 após cada impressão
                j--;
            }

            i += 2;

            // Reinicia o valor de J para o próximo bloco
            j += 5;
        }


    }

}
