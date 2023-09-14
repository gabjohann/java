package com.javacaldeira;

import java.util.Scanner;

/*  Criar um jogo de adivinhação para descobrir quantos soldados os 300 espartanos irão enfrentar.
    Leônidas pede para que seus soldados tentem adivinhar quantos inimigos irão combater
    O usuário deve digitar seu palpite e se o número for menor do que 300.000, Leônidas deve dizer Um pouco mais!,
    caso o número dito pelo usuário seja menor, ele dirá Um pouco menos!"
*/
public class exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guess;
        boolean guessIsNotCorrect = true;


        while (guessIsNotCorrect) {
            System.out.print("Informe o número de soldados que você julga que enfrentará: ");
            guess = scanner.nextInt();

            if (guess > 300) {
                System.out.println("Um pouco menos!");
            } else if (guess < 300) {
                System.out.println("Um pouco mais!");
            } else {
                System.out.println("Você acertou!");
                guessIsNotCorrect = false;
            }
        }

        scanner.close();
    }
}
