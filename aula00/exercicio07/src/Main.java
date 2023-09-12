import java.util.Scanner;

/*
    Criar para uma empresa de consórcio.
    No teste inicial, você deve perguntar para o usuário a idade dele e o seu salário.
    A pessoa só pode comprar um automóvel se for de maior e ganhar mais de R$ 2.000,00.
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Para iniciarmos, digite sua idade e seu salário: ");
        int age = scanner.nextInt();
        double salary = scanner.nextDouble();

        if (age >= 18 && salary >= 2000) {
            System.out.print("Você está apto à comprar se automóvel.");
        } else if (age >= 18) {
            System.out.print("Você não está apto à comprar seu automóvel, sua renda é muito baixa.");
        } else if (salary < 2000) {
            System.out.print("Você não está apto à comprar seu automóvel, sua renda é muito baixa e você é menor de idade.");
        } else {
            System.out.print("Você não está apto à comprar seu automóvel, você é menor de idade.");
        }

        scanner.close();
    }
}