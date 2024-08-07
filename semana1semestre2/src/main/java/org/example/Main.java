package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        int [] vetor = new int[4];
//
//        vetor[0] = 3;
//        vetor[1] = 4;
//        vetor[2] = 5;
//        vetor[3] = 6;



//        int [] novoVetor = {2024,2023,2025,2030};
//        System.out.println(novoVetor[0]);
//        novoVetor[0]= 2032;
//        System.out.println(novoVetor[0]);
//
//        System.out.println(novoVetor.length);

//        for (int i = 0; i < novoVetor.length; i++){
//            System.out.println(novoVetor[i]);
//        }
//
//        //loop aprimorado
//        for( int ano : novoVetor){
//            System.out.println(ano);
//        }
//
//        //While
//        int i = 0;
//        while (i != novoVetor.length){
//            System.out.println(novoVetor[i]);
//            i++;
//        }
//
//        //Array inicial de alunos
//        String[] alunos = new String[3];
//        alunos[0] = "João";
//        alunos[1] = "Maria";
//        alunos[2] = "Pedro";
//
//        // aumentar o array => adicionando aluno
//
//        String[] novaListaAluno = new String[4];
//        novaListaAluno[0] = alunos[0];
//        novaListaAluno[1] = alunos[1];
//        novaListaAluno[2] = alunos[2];
//        novaListaAluno[3] = "Joaquim";
//
//        System.out.println("Lista: NovaListaAlunos ");
//        for(String nomeAluno : novaListaAluno){
//            System.out.println(nomeAluno);
//        }
//
//
//
//        String[] novaListaAlunosAgil = Arrays.copyOf(alunos, alunos.length + 1);
//        novaListaAlunosAgil[3] = "Tiago";
//
//        System.out.println();
//        System.out.println("Lista: NovaListaAlunos");
//        for(String nomeAluno : novaListaAluno) {
//            System.out.println(nomeAluno);
//        }

//        int[] numerosInteiros = { 4,2,1,7};
//
//        int[] copiaNumerosInteiros = numerosInteiros;
//
//        numerosInteiros [0] = 1;
//
//        for (int num : copiaNumerosInteiros){
//            System.out.println(num);
//        }
//
//        int[] copiaProfundaNumerosInteiros = Arrays.copyOf(numerosInteiros, numerosInteiros.length);

//        ListaInteirosInfinitos lista = new ListaInteirosInfinitos();
//
//        lista.add(4);
//        lista.add(5);
//
//        lista.printAllNumeros();

//        int[] numerosInteirosDesordenados= { 4,2,1,7};
//        for (int num : numerosInteirosDesordenados){
//            System.out.println(num);
//        }
//        Arrays.sort(numerosInteirosDesordenados);
//
//        System.out.println();
//
//        for (int num : numerosInteirosDesordenados){
//            System.out.println(num);
//        }

//        int [] numeros = new int[10];
//         Arrays.fill(numeros, 5);
//         for (int num : numeros){
//             System.out.println(num);
//         }

            // pesquisa binaria


            int[] vetor2 = {1, 2, 5, 7, 9};

            int i = Arrays.binarySearch(vetor2, 7);

            System.out.println(vetor2[i]);


    }
}