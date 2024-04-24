package listaSemana9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdministradorTest {

    @Test
    void calcular_salario_mais_ajudaDeCusto_calcularSalario() {
        Administrador administrador = new Administrador(234,1000d,5d,400d);
        Assertions.assertEquals(1350,administrador.calcularSalario());
    }
}