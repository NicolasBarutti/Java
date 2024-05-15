package org.example.Exercicio2;

public class Fibonacci {
    public static int calcularFibonnaci(int n ){
        if(n <= 1){
            return n;

        }else {
            return calcularFibonnaci(n - 1 ) + calcularFibonnaci(n - 2);
        }
    }
}
