package listaSemana9;

public class Administrador extends Empregado{

    private Double ajudaDeCusto;
    public Administrador(int codigoSetor, Double salarioBase, Double imposto, Double ajudaDeCusto) {
        super(codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public Double calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto;
    }
}
