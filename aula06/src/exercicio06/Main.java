package exercicio06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        ContaBancaria contaBancaria = new ContaBancaria(100.50);

        System.out.println("Bem vindo!");
        System.out.print("Digite o valor que deseja sacar: ");
        value = scanner.nextInt();

        try {
            contaBancaria.sacar(value);
        } catch (SaldoInsuficienteException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
