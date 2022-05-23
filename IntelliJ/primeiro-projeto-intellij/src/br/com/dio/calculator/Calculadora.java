package br.com.dio.calculator;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a, b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        double sum = sum(a, b);
        double subtraction = subtraction(a, b);
        double multiplication = multiplication(a, b);
        double division = division(a, b);

        System.out.println("Soma: " + sum);
        System.out.println("Subtração: " + subtraction);
        System.out.println("Multiplicação: " + multiplication);
        System.out.println("Divisão: " + division);
    }

    public static double sum(double a, double b) {
        return a + b;
    }
    public static double subtraction(double a, double b) {
        return a - b;
    }
    public static double multiplication(double a, double b) {
        return a * b;
    }
    public static double division(double a, double b) {
        return a / b;
    }
}