import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");

        String name = scanner.next();

        System.out.print("Bem vindo(a), " + name +  "!");

        scanner.close();
    }
}