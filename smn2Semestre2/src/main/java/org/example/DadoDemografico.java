package org.example;

public class DadoDemografico {

    private int populacao;

    private int idadedeMediaPopulacao;

    public DadoDemografico(int populacao, int idadedeMediaPopulacao) {
        this.populacao = populacao;
        this.idadedeMediaPopulacao = idadedeMediaPopulacao;
    }

    public int getPopulacao() {
        return populacao;
    }

    public int getIdadedeMediaPopulacao() {
        return idadedeMediaPopulacao;
    }
}
