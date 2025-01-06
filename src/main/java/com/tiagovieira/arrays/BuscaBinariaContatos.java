package com.tiagovieira.arrays;

import java.util.Arrays;
import java.util.Scanner;



public class BuscaBinariaContatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] contatos = {"Ana", "Bruno", "Carlos", "Eduarda", "Fernanda", "Gabriel", "João", "Luiza", "Mariana", "Ricardo"};

        System.out.println("Lista de Contatos:");
        System.out.println(Arrays.toString(contatos));

        System.out.println("\nDigite o nome que deseja buscar: ");
        String nomeBuscado = sc.nextLine();

        int resultado = buscaBinaria(contatos, nomeBuscado);

        if (resultado != -1) {
            System.out.println("Nome encontrado no índice: " + resultado);

        } else {
            System.out.println("Nome não encontrado na lista.");
        }




    }

    public static int buscaBinaria(String[] array, String nomeBusca) {

        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            int comparacao = array[meio].compareToIgnoreCase(nomeBusca);

            if (comparacao == 0) {
                return meio;

            } else if (comparacao < 0) {
                inicio = meio + 1;

            } else {
                fim = meio - 1;
            }

        }

        return  -1;

    }


}
