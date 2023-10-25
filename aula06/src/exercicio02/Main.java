package exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayOfWeek;

        System.out.print("Digite um dia da semana: ");
        dayOfWeek = scanner.next().toUpperCase();

        try {
            DiaDaSemana choiceDate = DiaDaSemana.valueOf(dayOfWeek);

            switch (choiceDate) {
                case SEGUNDA:
                    System.out.println("Dia da semana escolhido: Segunda-feira");
                    break;
                case TERÇA:
                    System.out.println("Dia da semana escolhido: Terça-feira");
                    break;
                case QUARTA:
                    System.out.println("Dia da semana escolhido: Quarta-feira");
                    break;
                case QUINTA:
                    System.out.println("Dia da semana escolhido: Quinta-feira");
                    break;
                case SEXTA:
                    System.out.println("Dia da semana escolhido: Sexta-feira");
                    break;
                case SÁBADO:
                    System.out.println("Dia da semana escolhido: Sábado");
                    break;
                case DOMINGO:
                    System.out.println("Dia da semana escolhido: Domingo");
                    break;
                default:
                    System.out.println("Valor inválido!");
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("O dia da semana informado é inválido");
        } finally {
            scanner.close();
        }
    }
}
