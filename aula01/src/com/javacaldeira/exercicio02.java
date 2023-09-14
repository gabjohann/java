package com.javacaldeira;

import java.util.Scanner;

/*
    Implemente uma calculadora, onde o usuário deve entrar com 2 números e escolher a operação que deseja realizar.
    Durante a execução o programa deve perguntar ao usuário se ele deseja continuar, se ele não quiser, deve digitar ‘n’
    para o programa encerrar.
*/
public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        int operation;
        double result;
        String userCalculatingOption;

        boolean isCalculating = true;

        while (isCalculating) {

            System.out.print("Informe os valores que você deseja calcular: ");
            num1 = scanner.nextDouble();
            num2 = scanner.nextDouble();

            System.out.println("Operações: \n1. soma\n2. subtração\n3. divisão\n4. multiplicação\n5. percentual");
            System.out.print("Número da operação desejada: ");
            operation = scanner.nextInt();

            result = switch (operation) {
                case 1 -> num1 + num2;
                case 2 -> num1 - num2;
                case 3 -> num1 / num2;
                case 4 -> num1 * num2;
                case 5 -> (num1 * 100) / num2;
                default -> 0;
            };

            System.out.println("O resultado da operação é: " + result);
            System.out.print("Deseja realizar outra operação? sim(y), não(n) ");
            userCalculatingOption = scanner.next();

            if (userCalculatingOption.equals("n") || userCalculatingOption.equals("N")) {
                isCalculating = false;
            }

            scanner.close();
        }
    }
}

