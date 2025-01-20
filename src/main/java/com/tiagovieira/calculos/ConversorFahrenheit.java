package com.tiagovieira.calculos;

import java.util.Scanner;

public class ConversorFahrenheit   {
    
    public static double CelsiusFahrenheit(double celsius) {
        double calculo = (celsius * 1.8) + 32;

        return calculo;

    }

    
    public static double FahrenheitCelsius(double fahrenheit) {

        double calculo = (fahrenheit - 32) / 1.8;
        return calculo;

    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("=== Conversor de Temperatura ===");
        System.out.println("\nOpção 1: Converter Celsius para Fahrenheit");
        System.out.print("Digite a temperatura em Celsius: ");
        double grausCelsius = sc.nextDouble();
        double conversorF = CelsiusFahrenheit(grausCelsius);
        System.out.printf("%.2fºC é equivalente a %.2fºF\n\n", grausCelsius, conversorF);


        System.out.println("Opção 2: Converter Fahrenheit para Celsius");
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double grausFahrenheit = sc.nextDouble();
        double conversorC = FahrenheitCelsius(grausFahrenheit);
        System.out.printf("%.2fºF é equivalente a %.2fºC\n", grausFahrenheit, conversorC);
        
        sc.close();

    }

}

