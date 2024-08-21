package org.example;

import java.lang.reflect.Array;

public class Exercicio2 {

    private int[] array;
    private int size ;

    public Exercicio2(int max){
        array = new int[max];
    }

    public void add(int value){
        if (size< array.length){
            array[size]=value;
            size++;
        }else {
            System.out.println("Está cheio");
        }
    }
    public int peek() {
        if (size > 0) {
            return array[size - 1];

        }

        return -1;
    }



    public int pop() {
        if (size > 0) {
            size --;
        }

        return size;
    }
}