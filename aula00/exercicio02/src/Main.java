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
    }
}