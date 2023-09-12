/*    Crie um programa que converta uma quantia em dólares para outra moeda, como euros ou reais.
      Peça ao usuário para inserir a quantia em dólares e a taxa de câmbio atual.
      Em seguida, calcule e exiba o valor convertido.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor a ser convertido: ");
        double value = scanner.nextDouble();

        System.out.print("Agora informe o valor do câmbio atual e a moeda: ");
        double currencyExchange = scanner.nextDouble();
        String currency = scanner.next();

        double conversion = value * currencyExchange;

        System.out.print(String.format("%.2f dólar(es) equivale(em) a %.2f %s", value, conversion, currency));

        scanner.close();
    }
}