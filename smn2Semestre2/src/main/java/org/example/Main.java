package org.example;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //exercicio

        Pessoa pessoa1 = new Pessoa("Nicolas", 20, "1234567890");
        Pessoa pessoa2 = new Pessoa("Lucas", 29, "1234543212");
        Pessoa pessoa3 = new Pessoa("Caio", 11, "12345321232");

        Pessoa[] arraySimples = {pessoa1, pessoa2, pessoa3};

        for (Pessoa pessoa : arraySimples) {
            System.out.println(pessoa.getNome() + pessoa.getIdade() + pessoa.getCpf());

        }

    }
}


//        Set<String> Pessoa = new HashSet<>();



//        List<Integer>listaInteiros = new ArrayList<>();
//        // linkedList não compensa quando o for estiver no programa
//        list<Integer>linkedList = new linkedList<>();
//
//        listaInteiros.add(10);
//        listaInteiros.add(30);
//        listaInteiros.add(20);
//
//        System.out.println(listaInteiros.size());
//
//        printList(listaInteiros);
//
//        listaInteiros.remove(1);
//
////      //ultimo elemneto
//        System.out.println(listaInteiros.getLast());
//
//        //primeiro elemento
//        System.out.println(listaInteiros.getFirst());
//
//        listaInteiros.add(30);
//        listaInteiros.add(30);
//        listaInteiros.add(30);
//        listaInteiros.add(30);
//        listaInteiros.add(30);
//
//        printList(listaInteiros);
//
//        System.out.println(listaInteiros.getLast());
//
//        listaInteiros.removeLast();

        //        private static void printList (List < Integer > listaInteiros) {
//            System.out.println();
//            for (Integer integer : list) {
//                System.out.println(integer);
//            }
//            System.out.println();
//        }

//        Set<String> nomes = new HashSet<>();
//        nomes.add("Maria");
//        nomes.add("João");
//        nomes.add("Pedro");
//        nomes.add("Maria");
//        nomes.add("Carlos");
//
//        printList(nomes);
//
//
//        for (String nome : nomes) {
//            System.out.println(nome);
//        }
//}
//
//
//
//        private static void printList (Set<String> list) {
//            System.out.println();
//            for (String nome : list) {
//                System.out.println(nome);
//                System.out.println(Objects.hash(nome));
//            }
//            System.out.println();
//        }
