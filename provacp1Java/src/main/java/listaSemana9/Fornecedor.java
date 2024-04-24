package listaSemana9;

public class Fornecedor extends Pessoa{

   private Double valorCredito;

   private Double valorDivida;

    public Fornecedor(Double valorCredito, Double valorDivida) {
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }
    public Double obterSaldo(){
      return valorCredito - valorDivida;
    }

    public Double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(Double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public Double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(Double valorDivida) {
        this.valorDivida = valorDivida;
    }
}


