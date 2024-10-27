public class ContaCorrente extends Conta {
    private double taxaOperacao = 1.5;

    public ContaCorrente(String numeroConta) {
        super(numeroConta);
    }

    @Override
    public void depositar(double valor) {
        atualizarSaldo(valor);
        System.out.println("Depósito de R$" + valor + " realizado na conta corrente " + getNumeroConta());
    }

    @Override
    public void sacar(double valor) {
        double valorComTaxa = valor + taxaOperacao;
        if (getSaldo() >= valorComTaxa) {
            atualizarSaldo(-valorComTaxa);
            System.out.println("Saque de R$" + valor + " realizado na conta corrente " + getNumeroConta());
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }
}
