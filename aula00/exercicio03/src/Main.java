// Crie um programa que leia 3 números, imprima o maior, o menor e a média aritmética

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double num3 = scanner.nextDouble();

        double sum = num1 + num2 + num3;
        double avg = sum / 3;
        double smaller;
        double larger;
        String formattedResult = String.format("%.2f", avg);


        if (num1 < num2 && num1 < num3) {
            smaller = num1;
        } else smaller = Math.min(num2, num3);

        if (num1 > num2 && num1 > num3) {
            larger = num1;
        } else larger = Math.max(num2, num3);

        System.out.println("O menor número informado foi: " + smaller);
        System.out.println("O maior número informado foi: " + larger);
        System.out.println("A média entre eles é: " + formattedResult);
    }
}
