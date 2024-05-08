package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteTest {
    ContaCorrente contaCorrente = new ContaCorrente(200);

    @Test
    void quando_o_valor_setSaldo_mutiplicado_por_2_com_uma_taxa_percentual() {
        contaCorrente.atualizarConta(20);
        Assertions.assertEquals(280, contaCorrente.getSaldo());



    }

    @Test
    void depositar() {
        contaCorrente.depositar(400);
        Assertions.assertEquals(599.90, contaCorrente.getSaldo());
    }
}