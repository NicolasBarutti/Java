package org.example;

public class desafio1 {
    public static void main(String[] args) {


//        Crie um programa que leia um vetor de 10 inteiros e conte quantos sao pares e quantos sao impares

//        int[]vetor = {1, 4, 6, 8, 9, 12, 14, 17, 20, 21};
//
//        int numerosPar = 0;
//
//        int numerosImpar = 0;
//
//        for (int i = 0; i < vetor.length ; i++){
//            if (vetor [i] % 2 == 0){
//                numerosPar ++;
//            }else {
//                numerosImpar ++;
//            }
//
//
//        }
//        System.out.println("quantidade de numeros pares" + numerosPar);
//        System.out.println("qauntidade de numeros impares" + numerosImpar);

//        crie um programa que leia um vetor de 5 inteiros e imprima o vetor na ordem inversa

//        int[] vetor2 = {1, 5, 6, 8, 10};
//
//        for (int i = vetor2.length -1; i >= 0; i--){
//            System.out.println(vetor2[i]);
//        }


//        crie um progama que leia um vetor de 8 inteiros e determine o maior e o menor valor presente no vetor
       int[] vetor3 = {1, 3, 4, 6, 10, 32, 2, 9};

       int minimo = vetor3[0] ;
       int maximo = vetor3[0];

       for ( int numero : vetor3){
           if(numero >maximo){
               maximo =numero;
           }if(numero < minimo) {
               minimo = numero;
           }

       }
        System.out.println(minimo);
        System.out.println(maximo);

//    crie um progama que leia um vetor de 6 inteiros e calcule a media desses numeros

//      int[] vetor4 = {1, 5, 8, 9, 3, 2};
//
//      float soma =0;
//
//      for (float numero : vetor4){
//        soma +=  numero/ 6;
//
//    }
//        System.out.println(soma);




    }
}