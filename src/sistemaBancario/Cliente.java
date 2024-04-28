package sistemaBancario;

import java.util.Random;

public class Cliente extends Thread {
	private static final int SALARIO_MINIMO = 1400;
    private Conta conta;

    public Cliente(Conta conta) {
        this.conta = conta;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            int valorCompra = random.nextInt(2) == 0 ? 100 : 200;
            synchronized (conta) {
                if (conta.getSaldo() >= valorCompra) {
                    conta.sacar(valorCompra);
                    System.out.println(Thread.currentThread().getName() + " realizou uma compra de R$" + valorCompra);
                } else {
                    break;
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
