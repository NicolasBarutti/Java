package org.example;

public class ContaPoupanca extends Conta{
    @Override
    public double rendimento(double percentual) {
        return 3 * getSaldo() * percentual / 100;
    }


    @Override
    public void depositar(double deposito) {

    }
}
