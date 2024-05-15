package org.example.Exercicio1;

public abstract class Empregado implements CalculoPagamento {
    private String nome;

    public Empregado(String nome) {
        this.nome = nome;
    }
}
