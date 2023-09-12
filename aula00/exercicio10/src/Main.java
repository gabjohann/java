/*  Crie um programa em Java que peça ao usuário para inserir uma temperatura em graus Celsius e, em seguida,
    converta essa temperatura em graus Fahrenheit usando a fórmula: Fahrenheit = (Celsius * 9/5) + 32.
    Exiba o resultado na tela.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura, em graus Celsius: ");
        int temperature = scanner.nextInt();

        double temperatureF = (temperature * 9/5) + 32;

        System.out.print("Está " + temperatureF + "ºF");

        scanner.close();
    }
}