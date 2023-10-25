package exercicio05;

import java.util.Scanner;

import static exercicio05.VerificarIdade.verificarIdade;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int userAge;
            System.out.print("Informe sua idade: ");
            userAge = scanner.nextInt();

            verificarIdade(userAge);

            System.out.println(userAge + " é uma idade válida!");
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
