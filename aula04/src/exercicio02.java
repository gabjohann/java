/*
    Descrição: Crie um programa Java que gere automaticamente um array de 10 números inteiros aleatórios entre 1 e 100.
    Em seguida, peça ao usuário para inserir um número e verifique se esse número está presente no array.
    Exiba uma mensagem indicando se o número foi encontrado ou não.
*/
import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNumber;
        int[] numberList = new int[10];
        boolean isFind = false;
        int j = 0;

        for (int i = 0; i < 10; i++) {
            numberList[i] = (int) (Math.random() * 100) + 1;
        }

        System.out.print("Digite um número que esteja entre 1 e 100: ");
        userNumber = scanner.nextInt();

        while (!isFind && j < numberList.length) {
            if (numberList[j] == userNumber) {
                isFind = true;
            }
            j++;
        }

        String message = isFind ? "O número informado está presente na lista!" : "O número informado não está presente na lista!";

        System.out.print(message);
    }
}
