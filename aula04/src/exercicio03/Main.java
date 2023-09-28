package exercicio03;

/*
    Descrição: Crie um programa Java que permita ao usuário criar uma lista de tarefas.
    O programa deve permitir adicionar tarefas à lista, remover tarefas e exibir todas as tarefas na lista.
    Use um ArrayList para armazenar as tarefas. Tarefa deve ser uma classe do seu código com os atributos:
        titulo, data e descrição e métodos que você julgue necessários.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Tarefa> tasksList = new ArrayList<>();
        String title;
        String date;
        String description;
        int userOption;
        int taskIndice;

        while (true) {
            System.out.println("Selecione uma opção: ");
            System.out.println("1. Adicionar uma tarefa");
            System.out.println("2. Listas todas as tarefas");
            System.out.println("3. Remover uma tarefa");
            System.out.println("4. Sair");
            System.out.print("Digite o número da opção: ");
            userOption = scanner.nextInt();

            scanner.nextLine(); // limpeza do buffer

            switch (userOption) {
                case 1:
                    System.out.println("\nVamos cadastrar sua nova tarefa!");
                    System.out.print("Digite o título da sua tarefa: ");
                    title = scanner.nextLine();

                    System.out.print("Digite a data da sua tarefa: ");
                    date = scanner.nextLine();

                    System.out.print("Digite a descrição da sua tarefa: ");
                    description = scanner.nextLine();

                    Tarefa task = new Tarefa(title, date, description);
                    tasksList.add(task);

                    System.out.println("Tarefa adiciona com sucesso!\n");
                    break;

                case 2:
                    System.out.println("\nAqui está uma lista com todas as suas tarefas: ");

                    for (int i = 0; i < tasksList.size(); i++) {
                        System.out.println("Número da tarefa: " + i + " - " + tasksList.get(i).getTitle() + "\n");
                    }
                    break;

                case 3:
                    System.out.println("\nTarefas: ");
                    for (int i = 0; i < tasksList.size(); i++) {
                        System.out.println("Número da tarefa: " + i + " - " + tasksList.get(i).getTitle());
                    }
                    System.out.print("\nDigite o número da tarefa que deseja remover: ");
                    taskIndice = scanner.nextInt();

                    tasksList.remove(taskIndice);
                    System.out.println("Tarefa removida com sucesso!");
                    break;

                case 4:
                    System.out.println("\nAté mais!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
