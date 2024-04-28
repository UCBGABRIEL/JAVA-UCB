package sistemaBancario;

package sistemaBancario;

public class Funcionario extends Thread {
    private static final double SALARIO = 1400;
    private static final double TAXA_INVESTIMENTO = 0.2;
    private Conta contaSalario;
    private Conta contaInvestimento;

    public Funcionario(Conta contaSalario, Conta contaInvestimento) {
        this.contaSalario = contaSalario;
        this.contaInvestimento = contaInvestimento;
    }

    @Override
    public void run() {
        synchronized (contaSalario) {
            contaSalario.depositar(SALARIO);
            System.out.println(Thread.currentThread().getName() + " recebeu o salário de R$" + SALARIO);
        }
        synchronized (contaInvestimento) {
            double valorInvestimento = SALARIO * TAXA_INVESTIMENTO;
            contaInvestimento.depositar(valorInvestimento);
            System.out.println(Thread.currentThread().getName() + " investiu R$" + valorInvestimento + " em sua conta de investimento");
        }
    }
}
