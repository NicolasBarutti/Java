package org.example.Exercicio2;

import org.example.Exercicio2.Fibonacci;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void quando_o_n_for_zero_vai_dar_zero(){
        Assertions.assertEquals(0, Fibonacci.calcularFibonnaci(0));
    }

    @Test
    void quando_o_valor_n_ser_um_ele_vai_dar_um() {
        Assertions.assertEquals(1, Fibonacci.calcularFibonnaci(1));
    }

    @Test
    void quando_o_valor_de_n_for_nove_vai_receber_34(){
        Assertions.assertEquals(34,Fibonacci.calcularFibonnaci(9));
    }


}