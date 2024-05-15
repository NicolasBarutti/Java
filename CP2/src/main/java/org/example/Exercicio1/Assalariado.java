package org.example.Exercicio1;

public class Assalariado extends Empregado{
    private double salario;
    private Integer diasTrabalhados;

    public Assalariado(String nome,double salario, Integer diasTrabalhados) {
        super(nome);
        this.salario = salario;
        this.diasTrabalhados = diasTrabalhados;
    }

    public Integer getDiasTrabalhados() {
        if (diasTrabalhados < 0) {
            System.out.printf("Os dias trabalhados devem ser um número maior ou igual a zero");
        } else if (diasTrabalhados > 23) {
            System.out.printf("Os dias trabalhados não podem superar 23 dias");
        }
        return diasTrabalhados;
    }

    @Override
    public double getPagamento() {
        double porcentagemSalario = getDiasTrabalhados() / 23d;
        return salario * porcentagemSalario;
    }
}
