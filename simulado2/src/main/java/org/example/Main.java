package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//        int[] A = {1, 2, 3, 4, 5, 6, 7, 8,9, 10};
//
//        int[] B = {2, 3, 4, 6, 7, 9, 1, 8, 10, 5};
//
//        int[] C = new int[A.length];
//
//        for (int i = 0; i < A.length ; i++) {
//            C[i] = A[i] + B[i];
//        }
//
//        for (int valor : C){
//            System.out.println(valor );
//        }

    // exercicio2

        Exercicio2 exercicio2 = new Exercicio2(5);

        exercicio2.add(10);
        exercicio2.add(50);
        exercicio2.add(20);

        System.out.println(exercicio2.peek());

        System.out.println(exercicio2.pop());


    }
}