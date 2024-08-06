package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ListaInteirosInfinitos {

    int[] numeros = new int[0];

    public void add(int num) {
        numeros= Arrays.copyOf(numeros, numeros.length + 1);
        numeros[numeros.length - 1] = num;

    }

    public void printAllNumeros() {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("[" + i + "]=" + numeros[i]);
        }
    }
}
