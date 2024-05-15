package org.example.Exercicio1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpregadoTest {

    @Test
    void get_pagamento_quando_empregado_for_assalariado() {
        Empregado empregado = new Assalariado("teste", 3000.0,23);

        Assertions.assertEquals(3000, empregado.getPagamento());
    }

    @Test
    void get_pagamento_quando_empregado_for_horista() {
        Empregado empregado = new Horista("lucas",10,10);

        Assertions.assertEquals(100, empregado.getPagamento());
    }
}