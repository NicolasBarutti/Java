package org.example;

public class ContaCorrente extends Conta {


    @Override
    public double rendimento(double percentual) {
        return 2 * getSaldo()* percentual/ 100;
    }

    @Override
    public void depositar(double deposito){
        double novoValor =  deposito +getSaldo()- 0.1;
    }
}
