package exercicio03;

import java.text.MessageFormat;

public class Conta {
    double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            this.saldo = saldo - valor;
            System.out.println(MessageFormat.format("Saque de R${0} realizado com sucesso.", valor));
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void deposito(double valor) {
        this.saldo = saldo - valor;
        System.out.println("Foram depositados R$" + valor);
    }

    public void obterSaldo() {
        System.out.println("Saldo: R$" + getSaldo());
    }

}
