package org.example.Exercicio1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HoristaTest {

    @Test
    void get_pagamento_is_50_quando_valor_hora_5_is_horas_trabalhadas_is_10() {
        Horista horista = new Horista("teste", 5, 10);

        Assertions.assertEquals(50,horista.getPagamento());
    }
}