package org.example;

public class Exercicio2 {

    public static int calcularFibonnaci(int n ){
        if(n <= 1){
            return n;

        }
        return calcularFibonnaci(n - 1 ) + calcularFibonnaci(n - 2);
    }
}
