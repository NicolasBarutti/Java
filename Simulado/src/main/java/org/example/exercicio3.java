package org.example;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Scanner;




    public class exercicio3 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite uma data com formato dd MM yyyy ");


            DateTimeFormatter dia = DateTimeFormatter.ofPattern("dd");
            DateTimeFormatter mes = DateTimeFormatter.ofPattern("MM");
            DateTimeFormatter ano = DateTimeFormatter.ofPattern("yyyy");
            LocalDateTime now = LocalDateTime.now();
            System.out.println(dia.format(now));
            System.out.println(mes.format(now));
            System.out.println(ano.format(now));


        }
    }