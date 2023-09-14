package com.javacaldeira;

import java.util.*;

/*
    Escreva um programa que receba uma string do usuário e imprima ela ao contrário.
*/
public class exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userString;
       // ArrayList<String> userStringArray = new ArrayList<>();


        System.out.print("Informe uma palavra ou frase: ");
        userString = scanner.nextLine();

        userString = new StringBuilder(userString).reverse().toString();

        System.out.println("Palavra/frase invertida: " + userString);

        scanner.close();
    }

}
