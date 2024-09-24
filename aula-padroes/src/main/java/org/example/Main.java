package org.example;

import org.example.core.*;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Veiculo veiculo = new MotoFactory().create();

        Veiculo veiculo1 = new CarroFactory().create();

        List<Veiculo> veiculos = List.of(veiculo, veiculo1);

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        singleton1.printCreatedAt();
        singleton.printCreatedAt();
    }
}