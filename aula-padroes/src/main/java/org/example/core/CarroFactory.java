package org.example.core;

public class CarroFactory implements  FactoreVeiculo{
    @Override
    public Veiculo create() {
        return new Carro();
    }
}
