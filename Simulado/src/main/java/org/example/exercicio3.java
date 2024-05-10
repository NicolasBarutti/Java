package org.example;

import java.util.Scanner;
import java.time.LocalDate;



    public class exercicio3 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite uma data com formato dd/MM/yyyy ");


            String usuarioInforma = scanner.nextLine();

            LocalDate usuarioInformaData = LocalDate.parse(usuarioInforma);

            LocalDate dataAtual = LocalDate.now();

            long diferenca = dataAtual.datesUntil(usuarioInformaData).count();

            System.out.println("O intervalo e de " + diferenca + " de diferença, e a data atual é " + dataAtual);


        }
    }