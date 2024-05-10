package org.example;

import java.util.Scanner;
import java.time.LocalDate;

public class exercicio3 {

    public static long contarDias(String data) {
        LocalDate usuarioInformaData = LocalDate.parse(data);

        LocalDate dataAtual = LocalDate.now();
        long diferenca = dataAtual.datesUntil(usuarioInformaData).count();
        return diferenca;
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma data com formato yyyy-mm-dd ");


        String usuarioInforma = scanner.nextLine();


        System.out.println(contarDias(usuarioInforma));


    }
}