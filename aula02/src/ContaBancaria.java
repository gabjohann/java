import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ContaBancaria {
    private String nome;
    private String cpf;
    private String identificadorConta;
    private String banco;
    private String endereco;
    private double saldo;
    private LocalDateTime horarioAtual;

    public ContaBancaria(String nome, String cpf, String identificadorConta, String banco, String endereco, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.identificadorConta = identificadorConta;
        this.banco = banco;
        this.endereco = endereco;
        this.saldo = saldo;
        this.horarioAtual = LocalDateTime.now();
    }

    DateTimeFormatter formatterTimer = DateTimeFormatter.ofPattern("HH:mm:ss");

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdentificadorConta() {
        return identificadorConta;
    }

    public void setIdentificadorConta(int destino) {
        this.identificadorConta = identificadorConta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalDateTime getHorarioAtual() {
        return horarioAtual;
    }

    public void setHorarioAtual(LocalDateTime horarioAtual) {
        this.horarioAtual = horarioAtual;
    }


    public void saque(double valor) {
        if (valor <= saldo) {
            this.saldo = saldo - valor;
            System.out.println(MessageFormat.format("Saque de R${0} realizado com sucesso.", valor));
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void deposito(double valor, ContaBancaria destino) {
        this.saldo = saldo - valor;
        destino.saldo = saldo + valor;
        System.out.println("Foram depositados R$" + valor);
    }

    public void pix(double valor, ContaBancaria destino) {
        if (valor < saldo) {
            this.saldo = saldo - valor;
            destino.saldo = saldo + valor;
            System.out.println("PIX de: R$" + valor + " enviado.");
        }
        System.out.println("Saldo insuficiente!");
    }

    public void transferencia(ContaBancaria destino, double valor) {
        String[] splitHour = formatterTimer.format(horarioAtual).split(":");
        int hour = Integer.parseInt(splitHour[0]);
        if (hour >= 8 || hour <= 19) {
            if (saldo >= valor) {
                this.saldo = saldo - valor;
                destino.saldo = saldo + valor;
                System.out.println("Transferência de R$" + valor + " realizada para " + destino.nome);
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Estamos fora do horário de operação, tente novamente em outro horário!");
        }
    }

    public void verificarSaldo() {
        System.out.println("Saldo: R$" + getSaldo());
    }

    public void verificarInformacoes() {
        System.out.println(MessageFormat.format(
                "Nome: {0}\nCPF: {1}\nConta: {2}\nBanco: {3}\nEndereço: {4}\nSaldo: {5}",
                getNome(), getCpf(), getIdentificadorConta(), getBanco(), getEndereco(), getSaldo())
        );
    }

    public void verificarHorario() {
        System.out.println(formatterTimer.format(getHorarioAtual()));
    }

}