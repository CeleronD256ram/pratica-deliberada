package com.tiagovieira.beecrowd;

import java.util.Scanner;

public class Exe1101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        

        while (true) {

            int m = sc.nextInt();
            int n = sc.nextInt();

            if (m <= 0 || n <= 0) return;
            
            int menor = Math.min(m, n);
            int maior = Math.max(m, n);

            int soma = 0;
            StringBuilder sequencia = new StringBuilder();

            for (int i = menor; i <= maior; i++) {
                sequencia.append(i).append(" ");
                soma += i;
                
            }

            System.out.println(sequencia + "Sum" + soma);
            


            
        }
        






    }

}
