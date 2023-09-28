package exercicio04;

import java.util.LinkedList;
import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Compra> shoppingList = new LinkedList<>();
        String productName = "";
        String productExperyDate = "";
        int menuOption;

        Compra newShoppingList = new Compra(productName, productExperyDate);


        while (true) {
            System.out.println("Menu: ");
            System.out.println("1. Adicionar um produto a lista");
            System.out.println("2. Listas todas os produtos");
            System.out.println("3. Remover uma produto");
            System.out.println("4. Sair");
            System.out.print("Digite o número da opção: ");
            menuOption = scanner.nextInt();

            scanner.nextLine(); // limpeza do buffer

            switch (menuOption) {
                case 1:
                    System.out.println("\nVamos registar seu produto:");
                    System.out.print("Digite o nome do produto: ");
                    newShoppingList.setProductName(scanner.nextLine());
                    System.out.print("Digite a data de validade do produto: ");
                    newShoppingList.setExpirationDate(scanner.nextLine());
                    shoppingList.add(newShoppingList);

                    System.out.println("Produto adicionado a lista!");
                    break;

                case 2:
                    System.out.println("Lista de compras: ");

                    for (int i = 0; i < shoppingList.size(); i++) {
                        System.out.println(shoppingList);
                    }
                    break;

                case 3:
                    System.out.println("Lista de compras: ");
                    for (int i = 0; i < shoppingList.size(); i++) {
                        System.out.println("Número do produto na lista: " + i + " - " + newShoppingList.getProductName());
                    }
                    System.out.print("Digite o número do produto que deseja remover: ");
                    int productIndice = scanner.nextInt();

                    shoppingList.remove(productIndice);
                    System.out.print("Produto removido com sucesso!");
                    break;

                case 4:
                    System.out.print("Até mais!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida. Tente novamente.");

            }
        }
    }
}
