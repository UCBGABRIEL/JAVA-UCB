package sistemaBancario;

public class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public synchronized void depositar(double valor) {
        saldo += valor;
    }

    public synchronized void sacar(double valor) {
        saldo -= valor;
    }

    public synchronized double getSaldo() {
        return saldo;
    }

    public synchronized String getTitular() {
        return titular;
    }
}
