package exercicio06;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Reserva> reservationList = new LinkedList<>();

        String name;
        String location;
        long document;
        String checkIn;
        String checkOut;
        int userOptions;
        boolean keepAddReservations = true;


        while (keepAddReservations) {
            System.out.println("***** Menu de Reservas *****");
            System.out.println("1. Fazer uma nova reserva");
            System.out.println("2. Listas reservas");
            System.out.println("3. Cancelar reservas");
            System.out.print("Digite a opção escolhida: ");
            userOptions = scanner.nextInt();

            scanner.nextLine();

            switch (userOptions) {
                case 1:
                    System.out.println("Para que possamos fazer sua reserva, precisamos de alguns dados: ");
                    System.out.print("Digite seu nome: ");
                    name = scanner.nextLine();
                    System.out.print("Digite o seu destino: ");
                    location = scanner.nextLine();
                    System.out.print("Digite seu CPF (somente os números): ");
                    document = scanner.nextLong();
                    scanner.nextLine();
                    System.out.print("Digite a data de ida: ");
                    checkIn = scanner.nextLine();
                    System.out.print("Digite a data de volta: ");
                    checkOut = scanner.nextLine();

                    Reserva newReservation = new Reserva(name, location, document, checkIn, checkOut);
                    reservationList.add(newReservation);

                    System.out.println("Reserva realizada com sucesso!");
                    break;

                case 2:
                    System.out.println("Lista de reservas: ");
                    System.out.print(reservationList);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
