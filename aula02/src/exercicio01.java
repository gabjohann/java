public class exercicio01 {
    public static void main(String[] args) {
        ContaBancaria conta0 = new ContaBancaria(
                "Lucas Johann",
                "434.179.230-00",
                "1966413-9",
                "Bradesco",
                "Avenida Getúlio Vargas",
                3300.50
        );

        ContaBancaria conta1 = new ContaBancaria(
                "Gabriel Fernandes",
                "067.383.020-96",
                "97754-4",
                "Itaú",
                "Avenida dos Estados",
                30.00
        );

        conta1.saque(10);
        conta1.deposito(50.55, conta1);
        conta0.pix(100, conta1);
        conta1.transferencia(conta0, 20);
        conta0.verificarSaldo();
        conta1.verificarHorario();
        conta0.verificarInformacoes();
    }
}