public class ContaPoupanca extends Conta {
    public ContaPoupanca(String numeroConta) {
        super(numeroConta);
    }

    @Override
    public void depositar(double valor) {
        atualizarSaldo(valor);
        System.out.println("Depósito de R$" + valor + " realizado na conta poupança " + getNumeroConta());
    }

    @Override
    public void sacar(double valor) {
        if (getSaldo() >= valor) {
            atualizarSaldo(-valor);
            System.out.println("Saque de R$" + valor + " realizado na conta poupança " + getNumeroConta());
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }
}
