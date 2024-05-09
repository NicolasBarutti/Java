package org.example;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public double rendimento(double percentual) {
        return 3 * getSaldo() * percentual / 100;
    }


    @Override
    public void depositar(double deposito) {
        double novoValor =  deposito + getSaldo()- 0.10;
        setSaldo(novoValor);
    }




}
