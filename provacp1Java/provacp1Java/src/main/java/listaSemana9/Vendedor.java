package listaSemana9;

public class Vendedor extends Empregado {

    private Double valorVenda;

    private Double comissao;

    public Vendedor(int codigoSetor, Double salarioBase, Double imposto, Double valorVenda, Double comissao) {
        super(codigoSetor, salarioBase, imposto);
        this.valorVenda = valorVenda;
        this.comissao = comissao;
    }
    public Double get
    @Override
    public Double calcularSalario() {
        return super.calcularSalario();
    }
}
