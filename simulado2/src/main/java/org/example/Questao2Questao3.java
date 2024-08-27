package org.example;

import java.util.Arrays;

public class Questao2Questao3 {

    private int[] arr;


    public Questao2Questao3(){
        this.arr = new int[0];
    }

    public void add(int i) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = i;
    }


     public int peek() {
        return arr[arr.length - 1];
    }



    public int pop() {
        int ultimoElemento = peek();
        arr = Arrays.copyOf(arr, arr.length - 1);
        return ultimoElemento;
    }

    public void print(){
        System.out.println(Arrays.toString(arr));
    }

    public  int popFirst(){
        int[] arrNew = new int[arr.length - 1];
        for (int i = 1; i < arr.length ; i++) {
            arrNew[i -1] = arr[i];
        }
        int primeiroValor = arr[0];
        arr = arrNew;
        return primeiroValor;
    }

    public int popFirst2(){
        int primeiroElemento = arr[0];
        int[] newArr = new int[arr.length - 1];
        System.arraycopy(arr,1,newArr,0, newArr.length);
        return primeiroElemento;
    }
}