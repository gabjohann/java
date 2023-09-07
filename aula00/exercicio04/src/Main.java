/*  Crie um programa que leia o valor do salário mínimo e o valor do salário de um usuário,
    calcule a quantidade de salários mínimos que esse usuário ganha e imprima o resultado,
    assuma que o salário mínimo é R$1.320.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minimumWage = 1320;
        System.out.print("Digite o valor do seu salário: R$ ");
        double salary = scanner.nextDouble();

        double amount = salary/minimumWage;
        String formattedResult = String.format("%.1f", amount);

        System.out.println("Você ganha " + formattedResult + " salários mínimos.");
    }
}