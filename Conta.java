public abstract class Conta {
    private String numeroConta;
    private double saldo;

    public Conta(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract void depositar(double valor);
    public abstract void sacar(double valor);

    public void transferir(double valor, Conta contaDestino) {
        if (saldo >= valor) {
            sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " para conta " + contaDestino.getNumeroConta() + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }

    protected void atualizarSaldo(double valor) {
        this.saldo += valor;
    }
}
