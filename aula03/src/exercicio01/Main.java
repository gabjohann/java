package exercicio01;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Renault", "Clio", 2008);
        carro.calcularCustoViagem(100);

        Moto moto = new Moto("Harley-Davidson", "Sportster", 2021);
        moto.calcularCustoViagem(500);
    }
}
