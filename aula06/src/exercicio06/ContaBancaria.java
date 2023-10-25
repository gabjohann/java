package exercicio06;

public class ContaBancaria {
    private double balance;

    public ContaBancaria(double openingBalance) {
        this.balance = openingBalance;
    }

    public void sacar(double
                              withdrawalAmount) throws SaldoInsuficienteException {
        if (withdrawalAmount > balance) {
            throw new SaldoInsuficienteException("Saldo insuficiente! Saldo atual: R$" + balance);
        }

        balance -= withdrawalAmount;
        System.out.println("Saque realizado com sucesso. Saldo atual: R$" + balance);
    }
}
