package com.tiagovieira.beecrowd;

import java.util.Scanner;

/*
Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.
Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.
*/
public class Exe1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora de inicio e a hora final na ordem:");
        int horaInicio = sc.nextInt();
        int horaFinal = sc.nextInt();

        System.out.println("Digite os minutos de inicio e os minutos finais na ordem:");
        int minutoInicio = sc.nextInt();
        int minutoFinal = sc.nextInt();

        // Converte tudo para minutos
        int inicioEmMinutos = horaInicio * 60 + minutoInicio;
        int fimEmMinutos = horaFinal * 60 + minutoFinal;

        // Ajusta para jogos que passam da meia-noite
        if (fimEmMinutos <= inicioEmMinutos) {
            fimEmMinutos += 24 * 60; // Adiciona 24 horas em minutos
        }

        // Calcula a duração total em minutos
        int duracaoTotal = fimEmMinutos - inicioEmMinutos;
        int duracaoHoras = duracaoTotal / 60;
        int duracaoMinutos = duracaoTotal % 60;

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", duracaoHoras, duracaoMinutos);

        sc.close();
    }
}
