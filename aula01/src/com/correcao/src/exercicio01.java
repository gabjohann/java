import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DETERMINA NUMEROS PRIMOS NO INTERVALO QUE VOCÊ QUISER: ");

        System.out.println("Digite o primeiro numero: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Intervalo escolhido [ " + firstNumber + " , " + secondNumber + " ]");
        System.out.println("Numeros primos encontrados: ");

        for (int i = firstNumber; i <= secondNumber; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
