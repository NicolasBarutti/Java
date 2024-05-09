package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaPoupancaTest {
    ContaPoupanca contaPoupanca = new ContaPoupanca(300);


    @Test
    void quando_o_valor_setSaldo_300_mutiplicado_por_2_com_uma_taxa_percentual_de_10_porcento() {
        contaPoupanca.atualizarConta(10);
        Assertions.assertEquals(390, contaPoupanca.getSaldo());
    }

    @Test
    void quando_o_valor_saldo_300_foi_somado_com_deposito_de_200_e_depois_menos_10_centavos() {
        contaPoupanca.depositar(200);
        Assertions.assertEquals(499.90, contaPoupanca.getSaldo());
    }

    @Test
    void quando_saldo_15_saque_20_deve_receber_erro(){
        ContaPoupanca contaPoupancaMock = new ContaPoupanca();
        contaPoupancaMock.depositar(15.10);
        Assertions.assertThrows(RuntimeException.class, () -> contaPoupancaMock.sacar(20));
    }
}