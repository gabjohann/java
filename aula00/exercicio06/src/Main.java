/*
    Escreva um programa que leia a idade do usuário e imprima respostas diferentes dependendo do número colocado:
        - Se for menor de 16 anos, avisar que não pode votar;
        - Se tiver 16 ou 17, avisar que o voto é facultativo;
        - Se tiver mais de 65, avisar que também é facultativo o voto;
        - De 18 até 65, é obrigatório votar.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Olá, digite sua idade: ");
        int age = scanner.nextInt();

        if (age < 16) {
            System.out.print("Você não possui idadade para votar!");
        } else if (age <= 17 || age > 65) {
            System.out.print("Seu voto é facultativo!");
        } else
            System.out.print("Você é obrigado a votar!");
    }
}