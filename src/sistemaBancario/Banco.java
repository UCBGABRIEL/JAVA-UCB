package sistemaBancario;

public class Banco {
    public synchronized static void transferir(Conta contaOrigem, Conta contaDestino, double valor) {
        if (contaOrigem.getSaldo() >= valor) {
            contaOrigem.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferência no valor de R$" + valor + " realizada de " + contaOrigem.getTitular() + " para a(o)" + contaDestino.getTitular());
        } else {
            System.out.println("Saldo insuficiente para transferência, enviou " + contaOrigem.getTitular() + " para " + contaDestino.getTitular());
        }
    }
}
