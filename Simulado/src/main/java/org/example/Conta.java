package org.example;

public abstract class Conta implements  AtualizarConta {

    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public Conta() {
        this.saldo = 0d;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            throw new RuntimeException("Seu saldo é menor");
        } else {
            saldo -= valor;
        }
    }

    public abstract void depositar(double saldo);
    public void atualizarConta(double taxa){
        setSaldo(getSaldo() + rendimento(taxa));
    }
    public  abstract double rendimento(double percentual);
}

