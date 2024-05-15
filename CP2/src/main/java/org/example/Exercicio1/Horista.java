package org.example.Exercicio1;

public class Horista extends Empregado{

    private double horasTrabalhadas, valorHora;

    public Horista(String nome, double valorHora, double horasTrabalhadas) {
        super(nome);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getHorasTrabalhadas() {
        if (horasTrabalhadas < 0){
            System.out.printf("As horas trabalhadas devem ser um número maior ou igual a zero");
        }else if (horasTrabalhadas > 528){

        }
        return horasTrabalhadas;
    }

    @Override
    public double getPagamento() {
        return valorHora * horasTrabalhadas;
    }
}
