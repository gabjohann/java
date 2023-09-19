import java.time.LocalDateTime;
import java.util.Date;

public class exercicio01 {
    public static void main(String[] args) {
        ContaBancaria contaLucas = new ContaBancaria();
        contaLucas.nome = "Lucas Gabriel";
        contaLucas.cpf = "434.179.230-00";
        contaLucas.identificadorConta = 1960802 - 6;
        contaLucas.banco = "Bradesco";
        contaLucas.endereco = "Avenida Getúlio Vargas";
        contaLucas.saldo = 300.00;
        contaLucas.horarioAtual = LocalDateTime.now();

        contaLucas.verificarSaldo();
        contaLucas.verificarHorario();
    }
}