package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio2Test {


    @Test
    void validar_termo_1(){
        Assertions.assertEquals(1,Exercicio2.calcularFibonnaci(1));
    }
    @Test
    void validar_termo_2(){
        Assertions.assertEquals(1,Exercicio2.calcularFibonnaci(2));
    }

}