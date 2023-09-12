// Crie um programa que receba 2 números e imprima na tela.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");

        int num1 = scanner.nextInt();

        System.out.print("Digite outro número: ");
        int num2 = scanner.nextInt();

        System.out.print("O primeiro número digitado foi: "  + num1 + " e o segundo foi: " + num2);

        scanner.close();

        /*
         Declarando os valores como int, limita-se a crer que o usuário irá digitar valores interiors
         o ideal seria declarar como double e inicializar as variávies no início do código
         */

    }
}