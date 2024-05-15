package org.example.Exercicio3;

public class PessoaFisica extends Pessoa{

    public String cpf;



    public String getCpf() {
        return cpf;
    }

    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    @Override
    public boolean validarDocumento() {
        return false;
    }
}