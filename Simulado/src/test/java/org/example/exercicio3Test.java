package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class exercicio3Test {

    @Test
    void receber_82_quando_data_2024_07_31() {
        Assertions.assertEquals(82, exercicio3.contarDias("2024-07-31"));
    }

    @Test
    void receber_erro_quando_data_for_anterior(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> exercicio3.contarDias("2024-02-10"));
    }
}