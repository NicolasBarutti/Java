package listaSemana9;

public class Operario extends Empregado{

    private Double valorProducao;

    private Double comissao;

    public Operario(int codigoSetor, Double salarioBase, Double imposto, Double valorProducao, Double comissao) {
        super(codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }
    public Double getComissao(){
        return valorProducao * (comissao / 100);
    }
    @Override
    public Double calcularSalario() {
        return super.calcularSalario() + getComissao();
    }
}
