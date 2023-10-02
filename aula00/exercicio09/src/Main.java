// Crie um programa em Java que peça ao usuário para inserir seu ano de nascimento e, em seguida, calcule e exiba a idade.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu ano de nascimento: ");
        int birthYear = scanner.nextInt();

        System.out.print("Digite o ano em que estamos: ");
        int year = scanner.nextInt();

        int age = year - birthYear;
        System.out.print("Você tem " + age + " anos.");

        scanner.close();
    }
}