/*  Peça ao usuário que digite uma palavra ou frase e conte quantas vogais (a, e, i, o, u) estão presentes.
    Exiba o número de vogais na tela.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase sem acentos e caracteres especiais: ");
        String phrase = scanner.nextLine();

        String stringWithoutSpaces = phrase.replaceAll("\\s", "");
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int counter = 0;

        for (int i = 0; i < stringWithoutSpaces.length(); i++) {
            char search = stringWithoutSpaces.charAt(i);

            for (char vowel : vowels) {
                if (vowel == search) {
                    counter++;
                }
            }
        }

        System.out.print("A palavra/frase informada contém: " + counter + " vogais.");
    }
}