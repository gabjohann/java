/*    Escreva um programa que calcule o fatorial de um número inteiro não negativo fornecido pelo usuário.
      O fatorial de um número N é o produto de todos os inteiros de 1 até N.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro, não negativo: ");
        int value = scanner.nextInt();

        int factorial = 1;

        for (int i = 1; i <= value; i++) {
            factorial *= i;
        }

        System.out.printf("O fatorial de %d é %d.", value, factorial);

        scanner.close();

        // poderia inserir um laço condicional para garantir que o usuário não inseriu um valor negativo
    }
}