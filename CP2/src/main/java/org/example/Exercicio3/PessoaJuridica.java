package org.example.Exercicio3;

public class PessoaJuridica extends Pessoa{

    public String cnpj;



    public String getCnpj() {
        return cnpj;
    }

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    @Override
    public boolean validarDocumento() {
        return false;
    }
}
