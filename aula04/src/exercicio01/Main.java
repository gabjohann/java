package exercicio01;/*
    Descrição: Crie um programa Java que peça ao usuário para inserir 5 números inteiros e armazene-os em um array.
    Em seguida, calcule e exiba a soma e a média dos números inseridos.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        double avg = 0;

        int[] numbersList = new int[5];
        System.out.print("Digite 5 números inteiros separados por espaço: ");

        for (int i = 0; i < 5; i++) {
            numbersList[i] = scanner.nextInt();
            total += numbersList[i];

            avg = (double) total / 5;
        }

        System.out.println("A soma dos valores inseridos é: " + total + " e a média é: " + avg);
    }
}