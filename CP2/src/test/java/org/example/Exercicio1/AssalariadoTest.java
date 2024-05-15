package org.example.Exercicio1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssalariadoTest {

    @Test
    void get_dias_trabalhados_quando_for_20() {
        Assalariado assalariado = new Assalariado("teste",100.0,20);


        Assertions.assertEquals(20,assalariado.getDiasTrabalhados());
    }


    @Test
    void get_pagamento_quando_dias_trabalhados_for_23() {
        Assalariado assalariado = new Assalariado("teste",1000.0,23);
        assalariado.getPagamento();

        Assertions.assertEquals(1000,assalariado.getPagamento());
    }

    @Test
    void get_pagamento_quando_dias_trabalhados_for_20() {
        Assalariado assalariado = new Assalariado("teste",1000.0,20);
        assalariado.getPagamento();

        Assertions.assertEquals(869.5652173913044,assalariado.getPagamento());
    }

}