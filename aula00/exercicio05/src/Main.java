/* Crie um programa que armazene um horário (hora, minuto e segundo) em variáveis,
   depois, determine e exiba a quantidade de segundos que se passaram desde as 0h00min0s
   e a quantidade de segundos que faltam para a meia-noite.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Separados por espaços.");
        System.out.print("Digite a hora, os minutos e os segundos: ");
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int seconds = scanner.nextInt();

        int hoursInSeconds = hours * 3600;
        int minutesInSeconds = minutes * 60;

        int totalSeconds = hoursInSeconds + minutesInSeconds + seconds;
        // 24h = 86400s
        int remainingSeconds = 86400 - totalSeconds;
        System.out.print("Se passaram " + totalSeconds + " segundos desde às 0h00min0s e faltam " + remainingSeconds + " segundos para ser 0h00min0s novamente.");
    }
}