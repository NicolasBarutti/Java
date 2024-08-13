package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer>listaInteiros = new ArrayList<>();

        listaInteiros.add(10);
        listaInteiros.add(30);
        listaInteiros.add(20);

        System.out.println(listaInteiros.size());

        printList(listaInteiros);

        listaInteiros.remove(1);

//      //ultimo elemneto
        System.out.println(listaInteiros.getLast());

        //primeiro elemento
        listaInteiros.getFirst();

        listaInteiros.add(30);
        

    }

    private static void printList(List<Integer> listaInteiros) {
        System.out.println();
        for (Integer integer : int){

        }
    }
}