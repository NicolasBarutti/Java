package org.example;

import java.util.Objects;

public class Pessoa implements Comparable<Pessoa> {


    private String nome;

    private int idade;

    private String cpf;

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }


    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if (o == null || getClass() !=o.getClass())return false;
        Pessoa pessoa = (Pessoa) o;
        return idade == pessoa.idade && Objects.equals(nome, pessoa.nome)&& Objects.equals(cpf,pessoa.cpf);
    }

    @Override
    public int hashCode(){
        return Objects.hash(nome,idade,cpf);
    }

    @Override
    public int compareTo(Pessoa outraPessoa) {
        return Integer.compare(outraPessoa.getIdade(), this.idade);
    }
}