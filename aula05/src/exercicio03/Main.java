package exercicio03;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userSelected;
        String desiredLocality;
        Map<String, Contact> phoneBook = new TreeMap<>();

        phoneBook.put("Lucas", new Contact("Lucas", "998250020", "Avenida Rubem Berta, 473", "Leste"));
        phoneBook.put("João", new Contact("João", "987-654-3210", "Rua B, 456", "Sul"));
        phoneBook.put("Ana", new Contact("Ana", "555-123-4567", "Rua C, 789", "Centro"));
        phoneBook.put("Pedro", new Contact("Pedro", "777-888-9999", "Rua D, 101", "Leste"));
        phoneBook.put("Paula", new Contact("Paula", "222-333-4444", "Rua E, 202", "Oeste"));


        System.out.println("Lista de contatos: ");
        for (Contact contact : phoneBook.values()) {
            System.out.println(contact);
            System.out.println(System.lineSeparator());
        }

        System.out.println("Localidades: ");
        System.out.println("1: Norte");
        System.out.println("2: Sul");
        System.out.println("3: Leste");
        System.out.println("4: Oeste");
        System.out.println("5: Nordeste");
        System.out.println("6: Sudeste");
        System.out.println("7: Sudoeste");
        System.out.println("8: Noroeste");

        System.out.print("Digite o número da localidade desejada: ");
        userSelected = scanner.nextInt();

        switch (userSelected) {
            case 1:
                desiredLocality = "norte";
                break;
            case 2:
                desiredLocality = "sul";
                break;
            case 3:
                desiredLocality = "leste";
                break;
            case 4:
                desiredLocality = "oeste";
                break;
            case 5:
                desiredLocality = "nordeste";
                break;
            case 6:
                desiredLocality = "sudeste";
                break;
            case 7:
                desiredLocality = "sudoeste";
                break;
            case 8:
                desiredLocality = "noroeste";
                break;
            default:
                System.out.println("Localidade não encontrada.");
                return;
        }

        boolean foundContacts = getContactsFromDesiredLocality(phoneBook, desiredLocality);

        if (!foundContacts) {
            System.out.println("Nenhum contato encontrado para esta localidade.");
        }
    }

    public static boolean getContactsFromDesiredLocality(Map<String, Contact> phoneBook, String desiredLocality) {
        boolean foundContacts = false;

        for (Contact contato : phoneBook.values()) {
            if (contato.getArea().equalsIgnoreCase(desiredLocality)) {
                System.out.println(contato);
                System.out.println();
                foundContacts = true;
            }
        }

        return foundContacts;
    }
}
