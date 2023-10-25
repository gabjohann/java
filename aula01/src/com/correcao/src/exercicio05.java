import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        //Adicionei o while para o programa rodar 5 vezes
        while (i <= 5) {
            System.out.println("Digite um número");
            double value = scanner.nextDouble();
            if (value < 300000)
                System.out.println("Leônidas diz: UM POUCO MAIS!");
            else
                System.out.println("Leônidas diz: UM POUCO MENOS!");
            i++;
        }

        scanner.close();
    }
}
