package listaSemana9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpregadoTest {

    @Test
    void calculando_salario_menos_ImpostocalcularSalario() {
        Empregado empregado = new Empregado(252,1000d,5d);
        Assertions.assertEquals(950,empregado.calcularSalario());

    }
}