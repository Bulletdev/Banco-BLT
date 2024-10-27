public class BancoDigital {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("12345-6");
        ContaPoupanca contaPoupanca = new ContaPoupanca("78910-1");

        contaCorrente.depositar(1000);
        contaCorrente.sacar(200);
        contaCorrente.transferir(300, contaPoupanca);

        contaPoupanca.depositar(500);
        contaPoupanca.sacar(100);
    }
}
