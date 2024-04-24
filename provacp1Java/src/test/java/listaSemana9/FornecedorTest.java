package listaSemana9;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FornecedorTest {

    @Test
    void validar_valorCredito_menos_valorDividaobterSaldo() {
        Fornecedor fornecedor = new Fornecedor(1000d,500d);
        Assertions.assertEquals(500,fornecedor.obterSaldo());

    }
}