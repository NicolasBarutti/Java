package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Questao1 {
    public static void main(String[] args) {


        int[] A = {1, 2, 3, 4, 5, 6, 7, 8,9, 10};

        int[] B = {2, 3, 4, 6, 7, 9, 1, 8, 10, 5};

        int[] C = new int[A.length];

        for (int i = 0; i < C.length ; i++) {
            C[i] = A[i] + B[i];
            System.out.println(C[i]);
        }

//        System.out.println(Arrays.toString(C));



    }
}