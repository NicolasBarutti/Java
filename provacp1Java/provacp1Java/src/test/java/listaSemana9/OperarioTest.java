package listaSemana9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperarioTest {

    @Test
    void calcular_salario_mais_comissao_calcularSalario() {
        Operario operario = new Operario(212, 1000d, 5d, 1100d, 10d);
        Assertions.assertEquals(1060,operario.calcularSalario());
    }
}