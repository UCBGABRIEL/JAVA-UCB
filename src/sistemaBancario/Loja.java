package sistemaBancario;

public class Loja {
    private Conta conta;

    public Loja(Conta conta) {
        this.conta = conta;
    }

    public void pagarSalarios() {
        synchronized (conta) {
            double totalSalarios = Funcionario.SALARIO * 2; // Duas lojas, dois funcionários cada
            if (conta.getSaldo() >= totalSalarios) {
                conta.sacar(totalSalarios);
                System.out.println("Salários dos funcionários pagos com sucesso.");
            } else {
                System.out.println("Não há saldo suficiente para pagar os salários dos funcionários.");
            }
        }
    }
}
