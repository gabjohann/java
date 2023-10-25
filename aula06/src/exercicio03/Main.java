package exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            String num1;
            String num2;
            System.out.print("Digite dois números inteiros: ");
            num1 = scanner.next();
            num2 = scanner.next();

            if ((!isInteger(num1)) || (!isInteger(num2))) {
                throw new IllegalArgumentException("O número informado não é inteiro!");
            }

            System.out.print("Obrigado!");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: " + e);
        }
    }

    public static boolean isInteger(String str) {
        return str != null && str.matches("[0-9]*");
    }
}
