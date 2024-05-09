package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteTest {
    ContaCorrente contaCorrente = new ContaCorrente(200);

    @Test
    void quando_o_valor_setSaldo_200_mutiplicado_por_2_com_uma_taxa_percentual_de_20_porcento() {
        contaCorrente.atualizarConta(20);
        Assertions.assertEquals(280, contaCorrente.getSaldo());
    }

    @Test
    void quando_o_valor_saldo_200_foi_somado_com_deposito_de_400_e_depois_menos_10_centavos() {
        contaCorrente.depositar(400);
        Assertions.assertEquals(599.90, contaCorrente.getSaldo());
    }

    @Test
    void quando_saldo_15_saque_10_reebe_5() {
        Conta contaMock = new ContaCorrente();
        contaMock.depositar(15.1);
        contaMock.sacar(10);
        Assertions.assertEquals(5, contaMock.getSaldo());
    }

}