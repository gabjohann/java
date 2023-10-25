package com.javacaldeira;

import java.util.Scanner;

/*
    Escreva um programa que separa a string em duas metades e imprime a primeira parte.
*/
public class exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        System.out.print("Digite um palavra ou frase: ");
        userInput = scanner.nextLine();
        userInput = userInput.replaceAll("\\s", "");

        int splitString = userInput.length() / 2;
        System.out.println(userInput.substring(0, splitString));

        scanner.close();
    }
}
