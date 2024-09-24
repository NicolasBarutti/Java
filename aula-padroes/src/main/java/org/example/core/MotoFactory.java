package org.example.core;

public class MotoFactory implements  FactoreVeiculo{
    @Override
    public Veiculo create() {
        return new Moto();
    }
}
