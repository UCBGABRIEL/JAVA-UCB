# Sistema Bancário com Threads em Java

Este projeto implementa um sistema bancário utilizando Java 17 e threads para representar as entidades do sistema, como clientes, funcionários, lojas, banco e contas. 
O sistema simula transações bancárias, como compras, pagamentos de salários, transferências e investimentos.

## Entidades e Funcionalidades

### Cliente
- Representa um cliente do banco.
- Cada cliente é uma thread com uma conta bancária.
- Inicia com um saldo de R$ 1.000,00.
- Realiza compras alternando entre as lojas até o saldo ficar vazio.

### Funcionário
- Representa um funcionário de uma loja.
- Cada funcionário é uma thread com duas contas bancárias.
- Recebe salário da loja e investe 20% em uma conta de investimentos.
- Salário: R$ 1.400,00.

### Loja
- Representa uma loja no sistema.
- Possui uma conta bancária para receber pagamentos dos clientes.
- Paga os salários dos funcionários assim que receber o valor das vendas.

### Banco
- Representa o banco no sistema.
- Coordena as transações bancárias de forma síncrona.
- Garante a consistência dos saldos das contas.

### Conta
- Representa uma conta bancária.
- Possui um saldo e métodos para realizar transações como depósito, saque e transferência.

## Implementação e Funcionamento

- As classes Java foram organizadas de forma modular e clara para facilitar a compreensão.
- A lógica de transações bancárias, como compras, pagamentos de salários, transferências e investimentos, foi implementada em cada classe conforme as funcionalidades descritas.
- O banco coordena as transações garantindo a consistência dos saldos das contas, exibindo os valores das transferências e os saldos finais das contas.

## Autor

Este projeto foi desenvolvido por Gabriel José Silva
