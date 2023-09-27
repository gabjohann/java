package com.javacaldeira;

import java.util.Scanner;

/*
    Crie um programa que determine e escreva os números primos compreendidos entre um intervalo fornecido pelo usuário.
*/
public class exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number;

        System.out.print("Informe um número: ");
        number = scanner.nextDouble();

        if(number > 2 && checkIfIsCosing(number)){
            System.out.println("O número informado é primo!");
        } else {
            System.out.println("O número informado não é primo !");
        }

        scanner.close();
    }

    private static boolean checkIfIsCosing(double number) {

        boolean isCousing = true;

        for (int i = 2; i<number; i++){
            if(number % i == 0){
                isCousing = false;
                break;
            }
        }
        return isCousing;
    }
}
