import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ContaBancaria {
    public String nome;
    public String cpf;
    public int identificadorConta;
    public String banco;
    public String endereco;
    public double saldo;
    public LocalDateTime horarioAtual;

    public void saque(double valor) {
        if (valor < saldo) {
            this.saldo = saldo - valor;
        }
        System.out.print("Saldo insuficiente!");
    }

    public void deposito(double valor) {
        this.saldo = saldo + valor;
    }

    //pix

    // transferência

    public void verificarSaldo() {
        System.out.print("Saldo: R$" + saldo);
    }

    public void verificarInformacoes() {
        System.out.println("Nome: " + nome);
    }

    public void verificarHorario() {
        DateTimeFormatter formatterTimer = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(formatterTimer.format(horarioAtual));
    }

}


