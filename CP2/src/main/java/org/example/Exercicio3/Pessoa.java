package org.example.Exercicio3;

public abstract class Pessoa implements Validador {

    public  String nome;

    public String getNome() {
        return nome;
    }

    protected Pessoa(String nome) {
        this.nome = nome;
    }
}


