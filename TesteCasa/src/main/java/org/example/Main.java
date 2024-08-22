package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        SomaVariavel
//        int [] num1 = {1, 2, 3, 4, 5};
//        int [] num2 = {9, 8, 7, 6, 5};
//
//        int [] soma = new int[num1.length];
//
//        for (int i = 0; i < num1.length; i++) {
//            soma[i] = num1[i] + num2[i];
//
//        }
//
//        for (int i = 0; i < soma.length; i++) {
//            System.out.println("Indice" + i + ": "+ soma[i]);
//
//        }

        String[] frutas = {"Maça","Banana","Abacaxi"};
        Arrays.sort(frutas);

//        System.out.println(Arrays.toString(frutas));

        for (String fruta : frutas){
            System.out.println(fruta);

        }



    }
}