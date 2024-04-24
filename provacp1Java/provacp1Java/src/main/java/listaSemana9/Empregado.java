package listaSemana9;

public class Empregado extends Pessoa{

    private int codigoSetor;

    private Double salarioBase;

    private Double imposto;

    public Empregado(int codigoSetor, Double salarioBase, Double imposto) {
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }
    public Double getImposto(){
        return imposto / 100;
    }
    public Double calcularSalario(){
        return salarioBase - (getImposto() * salarioBase);
    }
}
