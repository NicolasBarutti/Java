package org.example;

public abstract class Conta implements AtualizarConta{

    private double saldo;


    public Conta(){
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(){

    }

    public void validaSaldo(double sacar) {
        if (sacar > saldo) {
            System.out.println("Seu saldo é menor");
        } else {
            System.out.println("Saque concluido");
        }
    }
    public void atualizarConta(double taxa){
        setSaldo(getSaldo()+rendimento(taxa));
    }
    public  abstract double rendimento(double percentual);
}
