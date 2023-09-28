package exercicio05;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Impressao> printList = new LinkedList<>();
        String username;
        String addNewPrint;
        int numPages;
        int userOptions;
        boolean keepAddPrintList = true;


        while (keepAddPrintList) {
            System.out.println("***** IMPRESSORA *****");
            System.out.println("1. Adicionar uma impressão a lista");
            System.out.println("2. Imprimir");
            System.out.print("Digite a opção escolhida: ");
            userOptions = scanner.nextInt();

            scanner.nextLine();

            switch (userOptions) {
                case 1:
                    System.out.print("Digite seu nome: ");
                    username = scanner.nextLine();
                   // newPrintList.setUsername(scanner.nextLine());
                    System.out.print("Digite o número de páginas a serem impressas: ");
                    numPages = scanner.nextInt();
                    // newPrintList.setNumPages(scanner.nextInt());

                    Impressao newPrintList = new Impressao(username, numPages);
                   printList.add(newPrintList);

                    System.out.println("Impressão adicionada a lista!\n");
                    break;

                case 2:
                    System.out.println("Lista de impressão: ");
                    System.out.println(printList);
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
