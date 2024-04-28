package sistemaBancario;

public class SistemaBancario {
    public static void main(String[] args) {
        Conta contaLoja1 = new Conta("Loja 1");
        Conta contaLoja2 = new Conta("Loja 2");
        Conta contaInvestimentoFuncionario1 = new Conta("Investimento Funcionário 1");
        Conta contaInvestimentoFuncionario2 = new Conta("Investimento Funcionário 2");

        Loja loja1 = new Loja(contaLoja1);
        Loja loja2 = new Loja(contaLoja2);

        Funcionario funcionario1 = new Funcionario(contaLoja1, contaInvestimentoFuncionario1);
        Funcionario funcionario2 = new Funcionario(contaLoja2, contaInvestimentoFuncionario2);

        Cliente[] clientes = new Cliente[5];
        for (int i = 0; i < 5; i++) {
            clientes[i] = new Cliente(new Conta("Cliente " + (i + 1)));
        }

        funcionario1.start();
        funcionario2.start();

        for (Cliente cliente : clientes) {
            cliente.start();
        }

        loja1.pagarSalarios();
        loja2.pagarSalarios();
    }
}

