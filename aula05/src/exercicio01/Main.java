package exercicio01;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userSelectedCategory;
        boolean findUserCategory = false;
        Stack<Livro> books = new Stack<>();

        books.push(new Livro("As Vantagens de Ser Invisível", "jovem adulto"));
        books.push(new Livro("A Coragem de não Agradar", "auto desenvovimento"));
        books.push(new Livro("Arrume sua Cama", "auto desenvovimento"));

        System.out.println("Lista de Livros: ");
        for (Livro livro : books) {
            System.out.println(livro);
        }

        System.out.print("Digite a categoria que deseja buscar: ");
        userSelectedCategory = scanner.next();

        for (Livro book : books) {
            if (book.getCategory().equals(userSelectedCategory)) {
                System.out.println(book);
                findUserCategory = true;
            }
        }

        if (!findUserCategory) {
            System.out.println("Categoria não encontrada!");
        }

       while (!books.isEmpty()) {
           Livro removedBook = books.pop();
           System.out.println("O livro " + removedBook.getTitle() + ", foi removido!");
       }
    }
}