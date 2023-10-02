/*
    Criar um algoritmo para definir as filas prioritárias.
    Seu programa deve exibir um menu de opções, perguntando se a pessoa é:
        - Gestante;
        - Idosa;
        - Deficiente;
        - Nenhuma das alternativas.
    Se ela for Deficiente, Idosa ou Gestante, tem direito a fila prioritária.
    Se não, não tem direito."
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tabela de classificação: \n1. Gestante\n2. Idosa\n3. Deficiente\n4. Nenhuma das alternativas");
        System.out.print("Digite o número corresponde a sua categoria: ");
        int identifier = scanner.nextInt();

        if (identifier >= 1 && identifier <= 3) {
            System.out.print("Você tem direito ao atendimento prioritário.");
        } else {
            System.out.print("Você não tem direito ao atendimento prioritário");
        }

        scanner.close();
    }
}