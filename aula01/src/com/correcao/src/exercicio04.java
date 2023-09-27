import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um frase/palavra");
        String input = scanner.nextLine();

        String reverseVersion1 = reverseText(input);
        System.out.println("[Solução 1] A string ao contrário é: " + reverseVersion1);

        String reverseVersion2 = reverseText(input);
        System.out.println("[Solução 2] A string ao contrário é: " + reverseVersion2);

        scanner.close();
    }

    public static String reverseText(String text) {
        StringBuilder stringBuilder = new StringBuilder(text);
        return stringBuilder.reverse().toString();
    }
}

