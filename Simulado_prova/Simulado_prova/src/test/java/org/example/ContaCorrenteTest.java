package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteTest {

    @Test
    void quando_o_valor_setSaldo_mutiplicado_por_2_com_uma_taxa_percentual() {
        ContaCorrente contaCorrente = new ContaCorrente(100 );

        Assertions.assertEquals(contaCorrente.getSaldo(200));



    }

    @Test
    void depositar() {
    }
}