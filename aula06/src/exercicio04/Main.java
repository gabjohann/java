package exercicio04;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        int num1;
        int num2;
        String userOption;

        System.out.print("Digite dois números inteiros: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        System.out.println(" === MENU DE OPERAÇÕES === ");
        System.out.println("1. ADDITION");
        System.out.println("2. SUBTRACTION");
        System.out.println("3. MULTIPLICATION");
        System.out.println("4. DIVISION");
        System.out.print("Digite a da opcão desejada: ");
        userOption = scanner.next().toUpperCase();

        try {
            Operacao operacao = Operacao.valueOf(userOption);

            switch (operacao) {
                case ADDITION:
                    System.out.println("Resultado: " + calculadora.addition(num1, num2));
                    break;
                case SUBTRACTION:
                    System.out.println("Resultado: " + calculadora.subtraction(num1, num2));
                    break;
                case MULTIPLICATION:
                    System.out.println("Resultado: " + calculadora.multiplication(num1, num2));
                    break;
                case DIVISION:
                    System.out.println("Resultado: " + calculadora.division(num1, num2));
                    break;
                default:
                    System.out.println("Operação inválida!");
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Operação inválida. Certifique-se de digitar o nome da operação.");
        } catch (ArithmeticException e) {
            System.out.println("Erro ao realizar divisão por zero: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
