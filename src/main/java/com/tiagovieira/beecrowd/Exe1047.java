package com.tiagovieira.beecrowd;

import java.util.Scanner;

/*
Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo.
A seguir calcule a duração do jogo.
Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.
*/
public class Exe1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lendo os valores de entrada
        int horaInicio = sc.nextInt();
        int minutoInicio = sc.nextInt();
        int horaFinal = sc.nextInt();
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

        // Se a duração for exatamente 24 horas, ajusta para não exceder o limite
        if (duracaoHoras == 24 && duracaoMinutos > 0) {
            duracaoHoras = 0;
        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", duracaoHoras, duracaoMinutos);

        sc.close();
    }
}
